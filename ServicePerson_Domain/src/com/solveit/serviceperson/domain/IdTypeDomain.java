package com.solveit.serviceperson.domain;

import java.util.UUID;

public final class IdTypeDomain {
	private UUID id;
	private String description;
	
	
	
	public IdTypeDomain(UUID id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public static final IdTypeDomain create(final UUID id, final String description) {
		return new IdTypeDomain(id,  description);
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
