package com.ft.platform.hostinfo;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.Strings;

public class HostLocation {

	public static final HostLocation hostLocation(String hostLocation) {
		return new HostLocation(hostLocation);
	}
	
	private final String hostLocation;
	
    @JsonCreator
	public HostLocation(String hostLocation) {
		if (Strings.isNullOrEmpty(hostLocation)) {
			throw new IllegalArgumentException("Host location must not be empty.");
		}
		this.hostLocation = hostLocation;
	}
	
	@Override
    @JsonValue
	public String toString() {
		return hostLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(hostLocation);
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
		HostLocation other = (HostLocation) obj;
		return Objects.equals(this.hostLocation, other.hostLocation);
	}
	
}
