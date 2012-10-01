/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

import edu.berkeley.path.model_elements.*;

public class NetworkTest {
  Network nw;
  
  @Before
  public void setup() {
    nw = new Network();
    nw.setName("test network");
    nw.setId("42");

    nw.setNodes(new ArrayList<edu.berkeley.path.model_elements_base.Node>());
    nw.setLinks(new ArrayList<edu.berkeley.path.model_elements_base.Link>());
    
    Node nd1;
    Node nd2;
    Link ln;

    nd1 = new Node();
    nd1.setId("1");
    nd1.setName("one");
    nd1.setType("hwy");
    nw.nodes.add(nd1);

    nd2 = new Node();
    nd2.setId("2");
    nd2.setName("two");
    nd2.setType("hwy");
    nw.nodes.add(nd2);

    ln = new Link();
    ln.setId("3");
    ln.setName("three");
    ln.setType("hwy");
    ln.setLaneCount(4.0);
    ln.setLength(1000.0);
    
    ln.setBegin(nd1);
    ln.setEnd(nd2);
    
    nw.links.add(ln);
  }

  @Test
  public void testNetworkDefaults() {
// this is not relevant because the test doesn't use the builder now
//    assertEquals(new org.apache.avro.util.Utf8("1"), nw.getId());
//    assertTrue(nw.getLinks().isEmpty());
//    assertTrue(nw.getNodes().isEmpty());
  }
  
  @Test
  public void testNetworkBuilderAssignments() {
    assertEquals("test network", nw.getName());
  }
  
  @Test(expected = org.apache.avro.AvroRuntimeException.class)
  public void testBadIndex() {
    nw.get(1000);
  }

  @Test
  public void testResolveReferences() {
    nw.resolveReferences();
    
    Node n1 = nw.getNodeById(1);
    assertTrue(n1 != null);
    assertEquals("one", n1.getName());
    
    Link ln3 = nw.getLinkById(3);
    assertTrue(ln3 != null);
    assertEquals("three", ln3.getName());

    // note that lookups by string ID work too:
    Node n2 = nw.getNodeById("2");
    assertTrue(n2 != null);
    assertEquals("two", n2.getName());
    
    assertEquals(n1, ln3.begin);
    assertEquals(n2, ln3.end);
    
    HashSet<Link> links_n1_to_n2 = n1.getOutLinksToNode(n2);
    HashSet<Link> expected_links_n1_to_n2 = new HashSet<Link>();
    expected_links_n1_to_n2.add(ln3);
    
    assertEquals(expected_links_n1_to_n2, links_n1_to_n2);
  }
}
