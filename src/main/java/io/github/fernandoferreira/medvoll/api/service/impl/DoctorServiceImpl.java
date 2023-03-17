package io.github.fernandoferreira.medvoll.api.service.impl;

import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorRequest;
import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorResponse;
import io.github.fernandoferreira.medvoll.api.domain.doctor.entity.Doctor;
import io.github.fernandoferreira.medvoll.api.repository.DoctorRepository;
import io.github.fernandoferreira.medvoll.api.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public DoctorResponse save(DoctorRequest doctorRequest) {
        Doctor doctor = new Doctor(doctorRequest);
        this.doctorRepository.save(doctor);

        return new DoctorResponse();
    }

}
