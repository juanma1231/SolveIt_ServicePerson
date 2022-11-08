package com.solveit.serviceperson.application.entityassembler.implementation;

import com.solveit.serviceperson.application.entityassembler.EntityAssembler;
import com.solveit.serviceperson.crosscuting.utils.object.UtilObject;
import com.solveit.serviceperson.domain.PersonDomain;
import com.solveit.serviceperson.domain.builder.PersonDomainBuilder;
import com.solveit.serviceperson.entity.PersonEntity;

public class PersonEntityAssembler implements EntityAssembler<PersonEntity, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonEntity entity) {
		PersonDomain domain = new PersonDomainBuilder().get().build();
		
		if(UtilObject.getUtilObject().isNull(domain)) {
			domain = new PersonDomainBuilder().get().setId(entity.getId()).setName(entity.getName()).setLastName(entity.getLastName())
					.setIdNumber(entity.getIdNumber()).setIdType(null).setPhoneNumber(entity.getPhoneNumber()).setMail(entity.getMail())
					.setDescription(entity.getDescription()).setZone(null).setPassword(entity.getPassword()).build();
		}
		return domain;
	}

	@Override
	public PersonEntity assembleEntity(PersonDomain domain) {
		PersonEntity entity = new PersonEntity();
		if(domain != null) {
			entity = new PersonEntity(domain.getId(),domain.getName(),domain.getLastName(),domain.getIdNumber(),null,domain.getPhoneNumber()
					,domain.getMail(),domain.getDescription(),null,domain.getPassword());
		}
		return entity;
	}

}
