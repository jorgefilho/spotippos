package org.github.jorgefilho.spotippos.api.controller.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Long id) {
		super(String.format("The resource with id '%s' was not found.", id.toString()));
	}

	public ResourceNotFoundException() {
		super("The resource was not found.");
	}
}
