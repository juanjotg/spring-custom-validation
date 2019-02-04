package com.softtek.beca2019.exception;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.softtek.beca2019.error.CustomError;

public abstract class CustomException extends Exception {

    private static final long serialVersionUID = 6096888689972554780L;

    private final Map<String, String> parameter;

    public CustomException() {
        super();
        this.parameter = null;
    }

    public CustomException(String parameterKey, String parameterValue) {
        
        this.parameter = Collections.singletonMap(parameterKey, parameterValue);
    }

    public Map<String, String> getParameter() {
        return parameter;
    }

    public abstract CustomError getErrorMessage();

    public abstract HttpStatus getHttpStatus();

}
