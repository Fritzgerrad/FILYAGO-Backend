package com.frz.filyago.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private double latitude;
    private double longitude;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Double.compare(address.latitude, latitude) == 0 &&
                Double.compare(address.longitude, longitude) == 0;
    }
    @Override
    public String toString(){
        return "Address{" +
                "description=" + description +
                ", Long:'" + longitude + '\'' +
                ", Lat='" + latitude + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}
