package com.solveit.serviceperson.application.command.interfaces;

import com.solveit.serviceperson.dto.PersonDTO;

public interface CreatePersonPort {
	void execute(PersonDTO person);

}
