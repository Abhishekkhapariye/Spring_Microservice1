package com.exception.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionController {
	
	
	
	
	  @ExceptionHandler(value = ProductNotfoundException.class)
	   public ResponseEntity<Object> exception(ProductNotfoundException exception) {
	      return new ResponseEntity<>("Product not found!!", HttpStatus.NOT_FOUND);
	   }
	  
	  
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	  public  Map<String, String> handleValidationExceptions( MethodArgumentNotValidException ex) {
		  Map<String, String> errors = new HashMap<>();
		    ex.getBindingResult().getAllErrors().forEach((error) -> {
		        String fieldName = ((FieldError) error).getField();
		        String errorMessage = error.getDefaultMessage();
		        errors.put(fieldName, errorMessage);
		    });
		    return errors;

}
}
	  
