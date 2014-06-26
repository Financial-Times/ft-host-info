package com.ft.platform.hostinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HostInfo {

	@JsonProperty 
	private String certName;
	
	@JsonProperty
	private String environment;
	
    @JsonProperty
    private String hostName;

    @JsonProperty
    private String hostLocation;

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

	public String getHostName() {
		return hostName;
	}

	public String getHostLocation() {
		return hostLocation;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getPatchGroup() {
		return patchGroup;
	}
 
}
