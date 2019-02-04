package com.softtek.beca2019.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.softtek.beca2019.validation.UniqueLoginImpl;

@Target(ElementType.PARAMETER)
@Constraint(validatedBy = { UniqueLoginImpl.class })
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueLogin {
	
	String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
