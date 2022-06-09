package com.codegus.codegus.dtos.address;

public class AddressItem {

    private String country;

    private String region;

    private String subregion;

    private String community;

    private String address;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressItem{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", community='" + community + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
