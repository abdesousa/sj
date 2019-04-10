package com.springmvc.jackson.model;

import java.util.Map;

public class ExtendableBean {

    public String name;
    private Map<String, String> properties;

    public Map<String, String> getProperties() {
        return properties;
    }
}
