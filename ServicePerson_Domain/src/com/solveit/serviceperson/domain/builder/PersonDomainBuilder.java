package com.solveit.serviceperson.domain.builder;

import java.util.UUID;

import com.solveit.serviceperson.crosscuting.utils.UtilUUID;
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
	
	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}
	public final PersonDomain build() {
		return PersonDomain.create(id,name, lastName, idNumber, idType, phoneNumber, mail, description, zone, password);
	}
	
	public final UUID getId() {
		return id;
	}
	public final PersonDomainBuilder setId(UUID id) {
		this.id = id;
		return this;
	}
	public final String getName() {
		return name;
	}
	public final PersonDomainBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public final String getLastName() {
		return lastName;
	}
	public final PersonDomainBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public final int getIdNumber() {
		return idNumber;
	}
	public final PersonDomainBuilder setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		return this;
	}
	public final IdTypeDomain getIdType() {
		return idType;
	}
	public final PersonDomainBuilder setIdType(IdTypeDomain idType) {
		this.idType = idType;
		return this;
	}
	public final int getPhoneNumber() {
		return phoneNumber;
	}
	public final PersonDomainBuilder setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public final String getMail() {
		return mail;
	}
	public final PersonDomainBuilder setMail(String mail) {
		this.mail = mail;
		return this;
	}
	public final String getDescription() {
		return description;
	}
	public final PersonDomainBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	public final ZoneDomain getZone() {
		return zone;
	}
	public final PersonDomainBuilder setZone(ZoneDomain zone) {
		this.zone = zone;
		return this;
	}
	public final String getPassword() {
		return password;
	}
	public final PersonDomainBuilder setPassword(String password) {
		this.password = password;
		return this;
	}
	
	
	

}
