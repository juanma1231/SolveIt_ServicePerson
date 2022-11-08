package com.solveit.serviceperson.dto;

import java.util.UUID;

import com.solveit.serviceperson.crosscuting.utils.UtilUUID;



public class ZoneDTO {
	private UUID id;
	private String corregimiento;
	private String description;
	
	
	public ZoneDTO(UUID id, String corregimiento, String description) {
		super();
		this.id = id;
		this.corregimiento = corregimiento;
		this.description = description;
	}
	
	public ZoneDTO() {
		setId(UtilUUID.DEFAULT_UUID);
		setCorregimiento("");
		setDescription("");
	}
	
	public static final ZoneDTO create() {
		return new ZoneDTO();
	}


	public final UUID getId() {
		return id;
	}


	public final void setId(UUID id) {
		this.id = id;
	}


	public final String getCorregimiento() {
		return corregimiento;
	}


	public final void setCorregimiento(String corregimiento) {
		this.corregimiento = corregimiento;
	}


	public final String getDescription() {
		return description;
	}


	public final void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
