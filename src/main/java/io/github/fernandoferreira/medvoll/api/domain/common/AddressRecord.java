package io.github.fernandoferreira.medvoll.api.domain.common;

public record AddressRecord(String street, String district, String cep, String city, String uf, String additionalInfo, String number) {
}
