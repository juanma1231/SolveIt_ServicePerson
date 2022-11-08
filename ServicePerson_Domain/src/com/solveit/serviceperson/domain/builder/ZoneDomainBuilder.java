package com.solveit.serviceperson.domain.builder;

import java.util.UUID;

import com.solveit.serviceperson.crosscuting.utils.UtilUUID;
import com.solveit.serviceperson.domain.ZoneDomain;

public class ZoneDomainBuilder {
	private UUID id;
	private String corregimiento;
	private String description;
	
	
	public ZoneDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setCorregimiento("");
		setDescription("");

	}
	public static final ZoneDomainBuilder get() {
		return new ZoneDomainBuilder();
	}
	public final ZoneDomain build() {
		return ZoneDomain.create(id, corregimiento, description);
	}
	public final UUID getId() {
		return id;
	}
	public final ZoneDomainBuilder setId(UUID id) {
		this.id = id;
		return this;
	}
	public final String getCorregimiento() {
		return corregimiento;
	}
	public final ZoneDomainBuilder setCorregimiento(String corregimiento) {
		this.corregimiento = corregimiento;
		return this;
	}
	public final String getDescription() {
		return description;
	}
	public final ZoneDomainBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	
	
	

}
