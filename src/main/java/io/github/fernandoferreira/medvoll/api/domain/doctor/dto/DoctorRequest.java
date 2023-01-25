package io.github.fernandoferreira.medvoll.api.domain.doctor.dto;

import io.github.fernandoferreira.medvoll.api.domain.common.AddressRecord;
import io.github.fernandoferreira.medvoll.api.domain.doctor.Specialty;

public record DoctorRequest(String name, String email, String crm, Specialty specialty, AddressRecord address) {
}
