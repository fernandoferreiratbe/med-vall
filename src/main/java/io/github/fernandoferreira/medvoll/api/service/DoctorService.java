package io.github.fernandoferreira.medvoll.api.service;

import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorRequest;
import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorResponse;

public interface DoctorService {

    DoctorResponse save(DoctorRequest doctorRequest);

}
