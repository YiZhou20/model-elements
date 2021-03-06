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

public class Scenario extends edu.berkeley.path.model_elements_base.Scenario {
  // TODO find a better way to expose List<Network> access.
  
  /**
   * Get the list of networks contained in this scenario.
   * Never returns null (creates the list if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
  public List<Network> getNetworkList() {
    if (null == getNetworks()) {
      setNetworks(new ArrayList<edu.berkeley.path.model_elements_base.Network>());
    }
    return (List<Network>)(List<?>)getNetworks();
  }

  /**
   * Set the list of networks contained in this scenario.
   */
  @SuppressWarnings("unchecked")
  public void setNetworkList(List<Network> networkList) {
    setNetworks((List<edu.berkeley.path.model_elements_base.Network>)(List<?>)networkList);
  }

  public Long getLongId() {
    return Long.parseLong(getId().toString());
  }
  
  public void setId(Long id) {
    setId(id.toString());
  }
  
  public Long getLongProjectId() {
    return Long.parseLong(getProjectId().toString());
  }
  
  public String getNameString() {
    return (getName() == null) ? null : getName().toString();
  }

	@Override
	public FDSet getFdSet() {
		return (FDSet) super.getFdSet();
	}

	@Override
	public DemandSet getDemandSet() {
		return (DemandSet) super.getDemandSet();
	}

	@Override
	public SplitRatioSet getSplitratioSet() {
		return (SplitRatioSet) super.getSplitratioSet();
	}

	@Override
	public SensorSet getSensorSet() {
		return (SensorSet) super.getSensorSet();
	}
  
}
