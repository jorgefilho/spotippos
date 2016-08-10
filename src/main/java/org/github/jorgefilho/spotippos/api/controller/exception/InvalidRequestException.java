package org.github.jorgefilho.spotippos.api.controller.exception;

import org.springframework.validation.Errors;

public class InvalidRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Errors errors;

	public InvalidRequestException(Errors errors) {
		super("Invalid Request! ");
		this.errors = errors;
	}

	public Errors getErrors() {
		return errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
	}
}