package com.springmvc.jackson.model;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class RawBean {
    public String name;

    public RawBean(String name, String json) {
        this.name = name;
        this.json = json;
    }

    @JsonRawValue
    public String json;
}