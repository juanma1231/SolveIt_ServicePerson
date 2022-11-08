package com.solveit.serviceperson.application.entityassembler.implementation;

import com.solveit.serviceperson.application.entityassembler.EntityAssembler;
import com.solveit.serviceperson.crosscuting.utils.object.UtilObject;
import com.solveit.serviceperson.domain.ZoneDomain;
import com.solveit.serviceperson.domain.builder.ZoneDomainBuilder;
import com.solveit.serviceperson.entity.ZoneEntity;

public class ZoneEntityAssembler implements EntityAssembler<ZoneEntity, ZoneDomain> {

	@Override
	public ZoneDomain assembleDomain(ZoneEntity entity) {
		ZoneDomain domain = new ZoneDomainBuilder().get().build();
		if(UtilObject.getUtilObject().isNull(domain)) {
			domain = new ZoneDomainBuilder().get().setId(entity.getId()).setDescription(entity.getDescription()).setCorregimiento(entity.getCorregimiento())
					.build();
		}
		return domain;
	}

	@Override
	public ZoneEntity assembleEntity(ZoneDomain domain) {
		ZoneEntity entity = new ZoneEntity();
		if(domain != null) {
			entity = new ZoneEntity(domain.getId(),domain.getCorregimiento(), domain.getDescription());
		}
		return entity;
	}

}
