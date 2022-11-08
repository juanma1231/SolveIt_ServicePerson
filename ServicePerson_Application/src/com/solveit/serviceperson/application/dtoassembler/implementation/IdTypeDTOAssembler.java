package com.solveit.serviceperson.application.dtoassembler.implementation;

import com.solveit.serviceperson.application.dtoassembler.DTOAssembler;
import com.solveit.serviceperson.crosscuting.utils.object.UtilObject;
import com.solveit.serviceperson.domain.IdTypeDomain;
import com.solveit.serviceperson.domain.builder.IdTypeDomainBuilder;
import com.solveit.serviceperson.dto.IdTypeDTO;

public class IdTypeDTOAssembler implements DTOAssembler<IdTypeDTO, IdTypeDomain> {

	@Override
	public IdTypeDomain assembleDomain(IdTypeDTO dto) {
		IdTypeDomain domain = new IdTypeDomainBuilder().get().build();
		if(UtilObject.getUtilObject().isNull(domain)) {
			domain = IdTypeDomainBuilder.get().setId(dto.getId()).setDescription(dto.getDescription()).build();
		}
		return domain;
	}

	@Override
	public IdTypeDTO assembleDTO(IdTypeDomain domain) {
		IdTypeDTO dto = new IdTypeDTO();
		if (domain != null) {
			dto = new IdTypeDTO(domain.getId(),domain.getDescription());
		}
		return dto;
	}

}
