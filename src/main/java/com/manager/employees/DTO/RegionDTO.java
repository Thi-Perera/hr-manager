package com.manager.employees.DTO;

public class RegionDTO {

	private long regionId;
	private String regionName;

	public RegionDTO() {
	}

	public RegionDTO(long regionId, String regionName) {
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public String getregionName() {
		return regionName;
	}

	public void setregionName(String regionName) {
		this.regionName = regionName;
	}

}