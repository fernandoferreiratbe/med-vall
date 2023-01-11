package io.github.fernandoferreira.medvoll.api.domain.doctor;

import io.github.fernandoferreira.medvoll.api.domain.AddressRecord;

public record DoctorRequest(String name, String email, String crm, Specialty specialty, AddressRecord address) {
}
