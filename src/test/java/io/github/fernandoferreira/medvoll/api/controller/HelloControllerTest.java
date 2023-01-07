package io.github.fernandoferreira.medvoll.api.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;
import java.nio.charset.StandardCharsets;

@WebMvcTest
@DisplayName("Hello Controller Test")
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Given a valid request should process the requisition and return a text message")
    public void GivenValidRequest_ShouldProcessTheRequisition_ReturnTextMessage() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get(new URI("/hello"))
                .accept(MediaType.APPLICATION_JSON);

        MockHttpServletResponse response = this.mockMvc.perform(requestBuilder).andReturn().getResponse();

        Assertions.assertEquals(HttpStatus.OK.value(), response.getStatus());
        Assertions.assertEquals("Hello World Spring Boot 3!", response.getContentAsString(StandardCharsets.UTF_8));
    }
}
