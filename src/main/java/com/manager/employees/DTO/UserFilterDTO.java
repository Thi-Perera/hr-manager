package com.manager.employees.DTO;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserFilterDTO {

    private String departmentName;
    private String firstName;
    private String streetAddress;
    private String countryName;
    private String regionName;
    private Integer salaryMin;
    private Integer salaryMax;

    @JsonCreator
    public UserFilterDTO(
        @JsonProperty("departmentName") String departmentName,
        @JsonProperty("firstName") String firstName,
        @JsonProperty("streetAddress") String streetAddress,
        @JsonProperty("countryName") String countryName,
        @JsonProperty("regionName") String regionName,
        @JsonProperty("salaryMin") Integer salaryMin,
        @JsonProperty("salaryMax") Integer salaryMax) {
        this.departmentName = departmentName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.countryName = countryName;
        this.regionName = regionName;
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(Integer salaryMin) {
        this.salaryMin = salaryMin;
    }

    public Integer getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(Integer salaryMax) {
        this.salaryMax = salaryMax;
    }

}