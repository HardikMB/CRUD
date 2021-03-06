
package com.springops.crud;

import java.util.Date;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler(Exception.class) 
	public ResponseEntity<ErroMsg> somethingWentWrong(Exception ex) {

		ErroMsg errmgs = new ErroMsg(1, "Something Went Wrong", "Global", new Date());

		return new ResponseEntity<ErroMsg>(errmgs, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErroMsg> CustomValidationExceptionHandler(ConstraintViolationException ex) {

		ErroMsg errmgs = new ErroMsg(2, ex.getLocalizedMessage(), "CustomValidations", new Date());

		return new ResponseEntity<ErroMsg>(errmgs, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(IllegalStateException.class)
	public  ResponseEntity<ErroMsg> IllegalStateExc(IllegalStateException ex){
		
		ErroMsg errmgs = new ErroMsg(2, ex.getLocalizedMessage(), "Standard Exceptions", new Date());

		return new ResponseEntity<ErroMsg>(errmgs, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	
	}
	
}

class ErroMsg {

	public ErroMsg(int code, String message, String source, Date dt) {
		super();
		this.code = code;
		this.message = message;
		this.source = source;
		this.dt = dt;
	}

	private int code;
	private String message;
	private String source;
	private Date dt;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}
}
