package io.github.fernandoferreira.medvoll.api.controller;

import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @PostMapping
    public void postDoctor(@RequestBody DoctorRequest doctorRequest) {
        System.out.println(doctorRequest);
    }
}
