package io.github.fernandoferreira.medvoll.api.domain.doctor.entity;

import io.github.fernandoferreira.medvoll.api.domain.common.Address;
import io.github.fernandoferreira.medvoll.api.domain.doctor.Specialty;
import io.github.fernandoferreira.medvoll.api.domain.doctor.dto.DoctorRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    @Embedded
    private Address address;

    public Doctor(DoctorRequest doctorRequest) {
        this.name = doctorRequest.name();
        this.email = doctorRequest.email();
        this.crm = doctorRequest.crm();
        this.specialty = doctorRequest.specialty();
        this.address = new Address(doctorRequest.address());
    }

}
