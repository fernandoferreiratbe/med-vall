package io.github.fernandoferreira.medvoll.api.domain.common;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String district;
    private String zip;
    private String city;
    private String uf;
    private String additionalInfo;
    private String number;

    public Address(AddressRecord address) {
        this.street = address.street();
        this.district = address.district();
        this.zip = address.zip();
        this.city = address.city();
        this.uf = address.uf();
        this.additionalInfo = address.additionalInfo();
        this.number = address.number();
    }
}
