package com.softtek.beca2019.validation;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.softtek.beca2019.model.User;
import com.softtek.beca2019.validation.annotation.UniqueLogin;

public class UniqueLoginImpl implements ConstraintValidator<UniqueLogin, User> {

	@Override
	public boolean isValid(User value, ConstraintValidatorContext context) {

		 Set<String> entityRequestErrors = new HashSet<>();

	        if (value != null) {

	            entityRequestErrors = validate(value);

	        } else {

	            entityRequestErrors.add("You must provide a not null request body");
	        }

	        return isValid(context, entityRequestErrors);
										
	}

	
	private boolean isValid(ConstraintValidatorContext context, Set<String> entityErrors) {

        if (entityErrors.isEmpty()) {

            return true;

        } else {

            context.disableDefaultConstraintViolation();

            for (String error : entityErrors) {
                context.buildConstraintViolationWithTemplate(error).addConstraintViolation();
            }

            return false;
        }
    }
	
	
	private  Set<String> validate(User value) {
		
		Set<String> errors = new HashSet<>();
		
		errors.add("error 1");
		
		
		
		return errors;
		
	}
	

}
