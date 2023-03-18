package io.github.fernandoferreira.medvoll.api.domain.common;

public record AddressRecord(String street, String district, String zip, String city, String uf, String additionalInfo, String number) {
}
