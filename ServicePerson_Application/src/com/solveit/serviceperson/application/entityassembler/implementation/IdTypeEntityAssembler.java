package com.solveit.serviceperson.application.entityassembler.implementation;

import com.solveit.serviceperson.application.entityassembler.EntityAssembler;
import com.solveit.serviceperson.crosscuting.utils.object.UtilObject;
import com.solveit.serviceperson.domain.IdTypeDomain;
import com.solveit.serviceperson.domain.builder.IdTypeDomainBuilder;
import com.solveit.serviceperson.entity.IdTypeEntity;

public class IdTypeEntityAssembler implements EntityAssembler<IdTypeEntity, IdTypeDomain>{

	@Override
	public IdTypeDomain assembleDomain(IdTypeEntity entity) {
		IdTypeDomain domain = new IdTypeDomainBuilder().get().build();
		if(UtilObject.getUtilObject().isNull(domain)) {
			domain = new IdTypeDomainBuilder().get().setId(entity.getId()).setDescription(entity.getDescription()).build();
		}
		return domain;
	}

	@Override
	public IdTypeEntity assembleEntity(IdTypeDomain domain) {
		IdTypeEntity entity = new IdTypeEntity();
		if(domain != null) {
			entity = new IdTypeEntity(domain.getId(),domain.getDescription());
		}
		return entity;
	}

}
