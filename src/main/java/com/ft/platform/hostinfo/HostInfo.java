package com.ft.platform.hostinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HostInfo {

	@JsonProperty 
	private String certName;
	
	@JsonProperty
	private String environment;
	
    @JsonProperty
    private HostName hostName;

    @JsonProperty
    private HostLocation hostLocation;

    @JsonProperty
    private String ipAddress;
    
    @JsonProperty
    private String patchGroup;

	public String getCertName() {
		return certName;
	}

	public String getEnvironment() {
		return environment;
	}

	public HostName getHostName() {
		return hostName;
	}

	public HostLocation getHostLocation() {
		return hostLocation;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getPatchGroup() {
		return patchGroup;
	}
 
}
