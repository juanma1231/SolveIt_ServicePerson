package com.solveit.serviceperson.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.solveit.serviceperson.domain.IdTypeDomain;
import com.solveit.serviceperson.domain.PersonDomain;
import com.solveit.serviceperson.domain.ZoneDomain;

public class PersonDomainBuilder {
	private UUID id;
	private String name;
	private String lastName;
	private int idNumber;
	private IdTypeDomain idType;
	private int phoneNumber;
	private String mail;
	private String description;
	private ZoneDomain zone;
	private String password;
	
	
	public PersonDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setName("");
		setLastName("");
		setIdNumber(0);
		setIdType(idType);
		setPhoneNumber(0);
		setMail("");
		setDescription("");
		setZone(zone);
		setPassword("");
	}
	public final PersonDomain build() {
		return PersonDomain.create(id,name, lastName, idNumber, idType, phoneNumber, mail, description, zone, password);
	}
	
	public final UUID getId() {
		return id;
	}
	public final void setId(UUID id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getLastName() {
		return lastName;
	}
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public final int getIdNumber() {
		return idNumber;
	}
	public final void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public final IdTypeDomain getIdType() {
		return idType;
	}
	public final void setIdType(IdTypeDomain idType) {
		this.idType = idType;
	}
	public final int getPhoneNumber() {
		return phoneNumber;
	}
	public final void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public final String getMail() {
		return mail;
	}
	public final void setMail(String mail) {
		this.mail = mail;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	public final ZoneDomain getZone() {
		return zone;
	}
	public final void setZone(ZoneDomain zone) {
		this.zone = zone;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
