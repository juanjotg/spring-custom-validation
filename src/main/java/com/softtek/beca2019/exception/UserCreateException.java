package com.softtek.beca2019.exception;

import org.springframework.http.HttpStatus;

import com.softtek.beca2019.error.CustomError;

public class UserCreateException extends CustomException {

    private static final long serialVersionUID = 6569672128923233296L;

    private static final String CODE = "Create error";
    private static final String MESSAGE = "Hay un error intentando crear la cuenta";
    

    private static final HttpStatus HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

    public UserCreateException() {
        super();
    }

    public UserCreateException(String parameterKey, String parameterValue) {
        super(parameterKey, parameterValue);
    }

	@Override
	public CustomError getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpStatus getHttpStatus() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
