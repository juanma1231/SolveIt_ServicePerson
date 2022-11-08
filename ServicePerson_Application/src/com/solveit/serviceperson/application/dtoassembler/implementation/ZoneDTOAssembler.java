package com.solveit.serviceperson.application.dtoassembler.implementation;

import com.solveit.serviceperson.application.dtoassembler.DTOAssembler;
import com.solveit.serviceperson.crosscuting.utils.object.UtilObject;
import com.solveit.serviceperson.domain.ZoneDomain;
import com.solveit.serviceperson.domain.builder.ZoneDomainBuilder;
import com.solveit.serviceperson.dto.ZoneDTO;

public class ZoneDTOAssembler implements DTOAssembler<ZoneDTO, ZoneDomain>{

	@Override
	public ZoneDomain assembleDomain(ZoneDTO dto) {
		ZoneDomain domain = new ZoneDomainBuilder().get().build();
		if(UtilObject.getUtilObject().isNull(domain)) {
			domain = new ZoneDomainBuilder().get().setId(dto.getId()).setCorregimiento(dto.getCorregimiento()).setDescription(dto.getDescription())
					.build();
		}
		return domain;
	}

	@Override
	public ZoneDTO assembleDTO(ZoneDomain domain) {
		ZoneDTO dto = new ZoneDTO();
		if(domain != null) {
			dto = new ZoneDTO(domain.getId(),domain.getCorregimiento(),domain.getDescription());
		}
		return dto;
	}

}
