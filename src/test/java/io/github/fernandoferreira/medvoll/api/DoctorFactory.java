package io.github.fernandoferreira.medvoll.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.fernandoferreira.medvoll.api.domain.common.AddressRecord;
import io.github.fernandoferreira.medvoll.api.domain.doctor.DoctorRequest;
import io.github.fernandoferreira.medvoll.api.domain.doctor.Specialty;

public class DoctorFactory {

    private DoctorFactory() {}

    public static String getDoctorRequestInstance() throws JsonProcessingException {
        var mapper = new ObjectMapper();
        var address = new AddressRecord("Rua 1", "District", "1234567", "Liverpool",
                "LV", "1", "Additional");

        var doctorRequest = new DoctorRequest("John Walker", "jw@england.com", "1234",
                Specialty.ORTOPEDIA, address);

        return mapper.writeValueAsString(doctorRequest);
    }

    public static String getInvalidDoctorRequestInstance() {
        return "{ \"name\": \"John Walker\"";
    }

}
