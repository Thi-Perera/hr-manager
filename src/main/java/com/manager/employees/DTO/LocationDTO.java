package com.manager.employees.DTO;

public class LocationDTO {

    private long locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;


    public LocationDTO() {}

    public LocationDTO(long locationId, String streetAddress, String postalCode, String city, String stateProvince) {
       this.locationId = locationId;
       this.streetAddress = streetAddress;
       this.postalCode = postalCode;
       this.city = city;
       this.stateProvince = stateProvince;
    }

    public long getlocationId() {
       return locationId;
    }

    public void setLocationId(long locationId) {
       this.locationId = locationId;
    }

    public String getStreetAddress() {
       return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
       this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
       return postalCode;
    }

    public void setPostalCode(String postalCode) {
       this.postalCode = postalCode;
    }

    public String getCity() {
       return city;
    }

    public void setCity(String city) {
       this.city = city;
    }

    public String getStateProvince() {
       return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
       this.stateProvince = stateProvince;
    }
}