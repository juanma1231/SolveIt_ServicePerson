package com.solveit.serviceperson.entity;

import java.util.UUID;

import com.solveit.serviceperson.crosscuting.utils.UtilUUID;



public class IdTypeEntity {
	private UUID id;
	private String description;
	public IdTypeEntity(UUID id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public IdTypeEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setDescription("");
	}
	
	public static final IdTypeEntity create() {
		return new IdTypeEntity();
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
