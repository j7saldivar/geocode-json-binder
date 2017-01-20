package com.saldivar.databinder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {

	@JsonProperty("formatted_address")
	private String formattedAddress;

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	@Override
	public String toString() {
		return "Results [formattedAddress=" + formattedAddress + "]";
	}

}
