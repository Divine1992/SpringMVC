package net.divine.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<isValidHobby, String> {

	private String listOfValues;
	
	@Override
	public void initialize(isValidHobby isValidHobby) {
		this.listOfValues = isValidHobby.listOfValues();
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext arg1) {
		if (hobby == null) {
			return false;
		}
		if (hobby.matches(listOfValues)) {
			return true;
		} else {
			return false;
		}
	}

}
