package io.github.fernandoferreira.medvoll.api.domain.doctor.dto;

import io.github.fernandoferreira.medvoll.api.domain.common.AddressRecord;
import io.github.fernandoferreira.medvoll.api.domain.doctor.Specialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorRequest(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Specialty specialty,
        @Valid
        @NotNull
        AddressRecord address) {
}
