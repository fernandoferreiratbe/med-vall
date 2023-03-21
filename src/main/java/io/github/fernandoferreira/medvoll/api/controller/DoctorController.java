package io.github.fernandoferreira.medvoll.api.controller;

import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorRequest;
import io.github.fernandoferreira.medvoll.api.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public void postDoctor(@RequestBody @Valid DoctorRequest doctorRequest) {
        this.doctorService.save(doctorRequest);
    }
}
