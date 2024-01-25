package com.qsp.demostudent.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.qsp.demostudent.util.ResponceStructure;


@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<ResponceStructure<String>> idNotFoundExceptionHandler(IdNotFound id) {
		ResponceStructure<String> structure =new ResponceStructure<String>();
		structure.setMessage(id.getMessage());
		structure.setData("Student with given id not found");
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponceStructure<String>> (structure,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(PhoneNotFound.class)
	public ResponseEntity<ResponceStructure<String>> phoneNotFoundExceptionHandler(PhoneNotFound id) {
		ResponceStructure<String> structure =new ResponceStructure<String>();
		structure.setMessage(id.getMessage());
		structure.setData("Student with given id not found");
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponceStructure<String>> (structure,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(EmailNotFound.class)
	public ResponseEntity<ResponceStructure<String>> emailNotFoundExceptionHandler(EmailNotFound id) {
		ResponceStructure<String> structure =new ResponceStructure<String>();
		structure.setMessage(id.getMessage());
		structure.setData("Student with given id not found");
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponceStructure<String>> (structure,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ObtainMarkNotFound.class)
	public ResponseEntity<ResponceStructure<String>> obatainMarkNotFoundExceptionHandler(ObtainMarkNotFound id) {
		ResponceStructure<String> structure =new ResponceStructure<String>();
		structure.setMessage(id.getMessage());
		structure.setData("Student with given id not found");
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponceStructure<String>> (structure,HttpStatus.BAD_REQUEST);
	}
}
