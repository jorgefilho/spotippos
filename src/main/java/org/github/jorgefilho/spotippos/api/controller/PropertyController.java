package org.github.jorgefilho.spotippos.api.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;
import org.github.jorgefilho.spotippos.api.controller.exception.InvalidRequestException;
import org.github.jorgefilho.spotippos.api.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "/properties", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PropertyController {

	@Autowired
	private PropertyService propertyService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> post(@RequestBody @Valid final RequestProperty property, final BindingResult result,
			final UriComponentsBuilder uriBuilder) {
		if (result.hasErrors()) {
			throw new InvalidRequestException(result);
		}
		final ResponseProperty responseProperty = this.propertyService.save(property);
		final HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriBuilder.path("/properties/{id}").buildAndExpand(responseProperty.getId()).toUri());
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseProperty> get(@PathVariable Long id) {
		final Optional<ResponseProperty> optionalResponseProperty = this.propertyService.get(id);

		optionalResponseProperty.orElseThrow(
				() -> new org.github.jorgefilho.spotippos.api.controller.exception.ResourceNotFoundException(id));

		return ResponseEntity.ok(optionalResponseProperty.get());
	}
}
