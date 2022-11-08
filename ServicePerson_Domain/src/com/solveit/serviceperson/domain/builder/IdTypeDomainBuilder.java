package com.solveit.serviceperson.domain.builder;

import java.util.UUID;

import com.solveit.serviceperson.crosscuting.utils.UtilUUID;
import com.solveit.serviceperson.domain.IdTypeDomain;

public class IdTypeDomainBuilder {
	private UUID id;
	private String description;
	
	
	public IdTypeDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setDescription("");
	}
	public static final IdTypeDomainBuilder get() {
		return new IdTypeDomainBuilder();
	}
	public final IdTypeDomain build() {
		return IdTypeDomain.create(id, description);
	}
	public final UUID getId() {
		return id;
	}
	public final IdTypeDomainBuilder setId(UUID id) {
		this.id = id;
		return this;
	}
	public final String getDescription() {
		return description;
	}
	public final IdTypeDomainBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	
	

}
