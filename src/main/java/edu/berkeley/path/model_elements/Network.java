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

import java.util.*;

public class Network extends edu.berkeley.path.model_elements_base.Network {
  protected HashMap<Integer, Link> linkById = null;
  protected HashMap<Integer, Node> nodeById = null;
  
  public Network() {
    
  }
  
  public void resolveReferences() {
    linkById = new HashMap<Integer, Link>();
    nodeById = new HashMap<Integer, Node>();
    
    // pass 1: populate the HashMaps
    for (Node node : (List<Node>)(List<?>)getNodes()) {
      nodeById.put(node.getIntegerId(), node);
    }
    
    for (Link link : (List<Link>)(List<?>)getLinks()) {
      linkById.put(link.getIntegerId(), link);
    }
    
    // pass 2: set references
    for (Link link : (List<Link>)(List<?>)getLinks()) {
      link.resolveReferences(this);
      link.getBegin().resolveReferences(link);
      link.getEnd().resolveReferences(link);
    }
  }

  public Link getLinkById(Integer id) {
    if (linkById == null) {
      resolveReferences();
    }
    
    return linkById.get(id);
  }

  public Node getNodeById(Integer id) {
    if (nodeById == null) {
      resolveReferences();
    }
    
    return nodeById.get(id);
  }

  public Link getLinkById(String id) {
    return getLinkById(Integer.parseInt(id));
  }

  public Node getNodeById(String id) {
    return getNodeById(Integer.parseInt(id));
  }

  public Integer getIntegerId() {
    return Integer.parseInt(getId().toString());
  }
  
  public void setId(Integer id) {
    setId(id.toString());
  }

  // TODO methods to add, remove, set links call resolveReferences
}
