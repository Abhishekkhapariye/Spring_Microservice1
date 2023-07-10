//package com.exception;
//
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//
//
//@Documented
//@Constraint(validatedBy = SerialNumberValidator.class)
//@Target( { ElementType.PARAMETER, ElementType.FIELD })
//@Retention(RetentionPolicy.RUNTIME)
//public @interface SerialNumberConstraint {
//
//	 String message() default "Invalid phone number";
//	
//	 //represents group of constraints
//	    public Class<?>[] groups() default {};
//	    //represents additional information about annotation
//	    public Class<? extends Payload>[] payload() default {};
//	
//}
