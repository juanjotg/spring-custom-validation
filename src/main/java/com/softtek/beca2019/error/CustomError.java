package com.softtek.beca2019.error;

import java.util.List;

public class CustomError {
		
    // There was an error trying to create the user
    // There was an error trying to delete the user
    // There was an error trying to update the user
    // User not found
    private String message;
    
    private List<String> errors;
    
    public CustomError() {

    }
    
    public String getMessage() {
		return message;
	}
    
	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}


	


//	public ResponseEntity<CustomError> mapToResponseEntityError(HttpStatus responseStatus) {
//        CustomError error = new CustomError(this);
//        return new ResponseEntity<CustomError>(error, responseStatus);
//    }
}
