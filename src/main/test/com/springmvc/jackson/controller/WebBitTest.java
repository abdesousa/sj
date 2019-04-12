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
 
    /* 
	<form:form method="post" action="/sj/webBit.html" commandName="webBit">
		<div class="table-responsive">
			<table class="table table-bordered" style="width: 300px">
				<tr>
					<td>Id :</td>
					<td><form:input type="text" path="id" /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input type="text" path="name" /></td>
				</tr>
				<tr>
					<td>Description :</td>
					<td><form:input type="text" path="description" /></td>
				</tr>
				<tr>
					<td>Negation :</td>
					<td><form:input type="text" path="negation" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn btn-primary btn-sm" type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</div>
	</form:form>
 */


}
