package com.springmvc.jackson.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebBitDto {


    @JsonProperty("bits")
    private ArrayList<WebBit> bits;

    @JsonProperty("bitsArray")
    private WebBit[] bitsArray;

    
    public ArrayList<WebBit> getBits() {
		return bits;
	}

	public void setBits(ArrayList<WebBit> bits) {
		this.bits = bits;
	}

	public WebBitDto() {

    }

}
