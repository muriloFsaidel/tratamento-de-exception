package com.meuprojeto.tratamento.de.exception.Handlers;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {	
	
	@ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorResponse> notFound(NoSuchElementException ex) {
        ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "canção não encontrada, favor inserir id válido");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
	@ResponseBody
	@ExceptionHandler(InvalidYearException.class)
	public ErrorResponse invalidIdEException(InvalidYearException ex) {
		return new ErrorResponse(HttpStatus.EXPECTATION_FAILED.value(), ex.getMessage());
	}
}
