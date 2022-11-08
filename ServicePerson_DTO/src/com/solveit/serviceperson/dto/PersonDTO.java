package com.solveit.serviceperson.dto;

import java.util.UUID;

import com.solveit.serviceperson.crosscuting.utils.UtilUUID;





public class PersonDTO {
	private UUID id;
	private String name;
	private String lastName;
	private int idNumber;
	private IdTypeDTO idType;
	private int phoneNumber;
	private String mail;
	private String description;
	private ZoneDTO zone;
	private String password;
	
	public PersonDTO(UUID id, String name, String lastName, int idNumber, IdTypeDTO idType, int phoneNumber,
			String mail, String description, ZoneDTO zone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.idType = idType;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.description = description;
		this.zone = zone;
		this.password = password;
	}
	public PersonDTO() {
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
	public static final PersonDTO create() {
		return new PersonDTO();
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

	public final IdTypeDTO getIdType() {
		return idType;
	}

	public final void setIdType(IdTypeDTO idType) {
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

	public final ZoneDTO getZone() {
		return zone;
	}

	public final void setZone(ZoneDTO zone) {
		this.zone = zone;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
