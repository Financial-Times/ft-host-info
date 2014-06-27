package com.ft.platform.hostinfo;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.Strings;

public class HostName {

	public static final HostName hostName(String hostName) {
		return new HostName(hostName);
	}
	
	private final String hostName;
	
	@JsonCreator
	public HostName(String hostName) {
		if (Strings.isNullOrEmpty(hostName)) {
			throw new IllegalArgumentException("Host name must not be empty.");
		}
		this.hostName = hostName;
	}
	
	@Override
    @JsonValue
	public String toString() {
		return hostName;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(hostName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		HostName other = (HostName) obj;
		return Objects.equals(this.hostName, other.hostName);
	}
	
}
