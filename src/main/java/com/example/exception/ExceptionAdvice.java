package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.entity.EmployeeError;

@ControllerAdvice
public class ExceptionAdvice {
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<EmployeeError> mapException(EmployeeException employeeException){
		
	EmployeeError employeeError = new EmployeeError(HttpStatus.INTERNAL_SERVER_ERROR.value(), employeeException.getMessage());
		return new ResponseEntity<EmployeeError>(employeeError, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
