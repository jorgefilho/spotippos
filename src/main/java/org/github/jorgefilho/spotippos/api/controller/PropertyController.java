package org.github.jorgefilho.spotippos.api.controller;

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
	public ResponseEntity<Void> post(@RequestBody @Valid RequestProperty property, BindingResult result,
			UriComponentsBuilder uriBuilder) {
		if (result.hasErrors()) {
			throw new InvalidRequestException(result);
		}
		final ResponseProperty savedProperty = this.propertyService.save(property);
		final HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriBuilder.path("/properties/{id}").buildAndExpand(savedProperty.getId()).toUri());
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}
}
