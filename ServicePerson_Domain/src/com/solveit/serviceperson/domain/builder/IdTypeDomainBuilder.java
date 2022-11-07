package com.solveit.serviceperson.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.solveit.serviceperson.domain.IdTypeDomain;

public class IdTypeDomainBuilder {
	private UUID id;
	private String description;
	
	
	public IdTypeDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setDescription("");
	}
	public final IdTypeDomain build() {
		return IdTypeDomain.create(id, description);
	}
	public final UUID getId() {
		return id;
	}
	public final void setId(UUID id) {
		this.id = id;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	
	

}
