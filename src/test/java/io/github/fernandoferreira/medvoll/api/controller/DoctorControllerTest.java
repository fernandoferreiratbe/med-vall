package io.github.fernandoferreira.medvoll.api.controller;

import io.github.fernandoferreira.medvoll.api.DoctorFactory;
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

@WebMvcTest
@DisplayName("Doctor Controller Test")
public class DoctorControllerTest {

    private final String DOCTOR_RESOURCE = "/doctor";

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Given valid request should bind json object to record then return OK")
    public void GivenValidRequest_ShouldBindJsonObjectToRecord_ThenReturnOK() throws Exception {
        String doctorRequest = DoctorFactory.getDoctorRequestInstance();

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post(new URI(DOCTOR_RESOURCE))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(doctorRequest);

        MockHttpServletResponse response = this.mockMvc.perform(request).andReturn().getResponse();

        Assertions.assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    @DisplayName("Given invalid request should not bind json object to record then return Bad Request")
    public void GivenInvalidRequest_ShouldNotBindJsonObjectToRecord_ThenReturnBadRequest() throws Exception {
        String doctorRequest = DoctorFactory.getInvalidDoctorRequestInstance();

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post(new URI(DOCTOR_RESOURCE))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(doctorRequest);

        MockHttpServletResponse response = this.mockMvc.perform(request).andReturn().getResponse();

        Assertions.assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
    }

}
