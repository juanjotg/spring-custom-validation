package com.softtek.beca2019.controller.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.softtek.beca2019.error.CustomError;

@ControllerAdvice
public class ValidationExceptionHandler {

    

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<CustomError> handleExceptions(ConstraintViolationException exception) {
        
    	CustomError customError = new CustomError();
    	
    	customError.setMessage("The request fields are not valid");
    	customError.setErrors(getErrors(exception));
    	
    	return new ResponseEntity<>(customError, HttpStatus.BAD_REQUEST);
        
    }
    
    
    private List<String> getErrors(ConstraintViolationException exception) {
    	    	    
    	List<String> errors = new ArrayList<String>();
    	exception.getConstraintViolations().stream().forEach(constraintViolation -> errors.add(constraintViolation.getMessage()));
    	
    	return errors;
    	
    }
    
    
    

}
