package com.solveit.serviceperson.application.entityassembler;

public interface EntityAssembler<E,D> {
	D assembleDomain(E entity);
	E assembleEntity(D domian);

}
