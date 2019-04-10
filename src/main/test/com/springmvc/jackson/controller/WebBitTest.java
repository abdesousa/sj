package com.springmvc.jackson.controller;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springmvc.jackson.model.WebBit;

public class WebBitTest {

    @Test
    public void whenDeserializingUsingJsonArray_thenCorrect()
            throws IOException {

        String json = "[{\"id\":45596,\"name\":\"CDA\",\"description\":\"CDA supported teste\",\"negation\":\"CDA not supported\"}," +
                "{\"id\":45597,\"name\":\"terminal_contactless_pre_tap\",\"description\":\"Terminal supports Contactless Pre-tap supptorted\",\"negation\":\"Terminal supports Contactless Pre-tap not supported\"}," +
                "{\"id\":45598,\"name\":\"EU_EEA_terminal\",\"description\":\"PSD2 FOR EU/EEA teste11supported\",\"negation\":\"PSD2 FOR EU/EEA terminal not supported\"}]";


        ObjectMapper mapper = new ObjectMapper();

        List<WebBit> myObjects = Arrays.asList(mapper.readValue(json, WebBit[].class));

        for (WebBit bean : myObjects) {

            System.out.println(bean.toString());

        }

    }

}
