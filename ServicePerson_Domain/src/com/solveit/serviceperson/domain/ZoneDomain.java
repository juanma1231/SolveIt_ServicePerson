package com.solveit.serviceperson.domain;

import java.util.UUID;

public final class ZoneDomain {
	private UUID id;
	private String corregimiento;
	private String description;
	
	public ZoneDomain(UUID id, String corregimiento, String description) {
		super();
		this.id = id;
		this.corregimiento = corregimiento;
		this.description = description;
		
	}
	
	public static final ZoneDomain create(final UUID id, final String corregimiento, final String description) {
		return new ZoneDomain(id, corregimiento, description);
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
