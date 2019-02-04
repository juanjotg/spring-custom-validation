package com.softtek.beca2019.controller.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.softtek.beca2019.error.CustomError;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

    
//    @ExceptionHandler(CustomException.class)
//    ResponseEntity<CustomError> handleExceptions(CustomException exception) {
//        
//        HttpStatus exceptionStatus = exception.getHttpStatus();
//
//        LOG.error("[CIAM] [EXCEPTION HANDLER] [{}] [Exception = {}]", exceptionClassName.toUpperCase(), exception.getParameter());
//
//        return exception.getErrorMessage().mapToResponseEntityError(exceptionStatus);
//
//    }
    
    
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
        HttpHeaders headers, HttpStatus status, WebRequest request) {
    	
    	List<String> errors = new ArrayList<String>();
    	
    	for (FieldError error : ex.getBindingResult().getFieldErrors()) {
    		
    		errors.add(error.getField() + ": " + error.getDefaultMessage());
    	}
    	    	    	
    	  	  
    	CustomError customError = new CustomError();
    	
    	customError.setMessage(ex.getLocalizedMessage());
    	customError.setErrors(errors);
                
    	return new ResponseEntity<>(customError, HttpStatus.BAD_REQUEST);
    } 


}
