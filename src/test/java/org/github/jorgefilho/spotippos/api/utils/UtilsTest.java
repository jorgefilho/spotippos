package org.github.jorgefilho.spotippos.api.utils;

import java.util.Optional;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;
import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class UtilsTest {

	@Test
	public void copyProperties_whenRequestPropertyIsNull_shouldNotReturnError() {
		final Property property = Utils.copyProperties(RequestPropertyUtils.getNullRequestProperty());
		assertNull(property);
	}

	@Test
	public void copyProperties_RequestPropertyIsValid_shouldNotReturnError() {
		final RequestProperty requestProperty = RequestPropertyUtils.getValidRequestProperty();
		final Property property = Utils.copyProperties(requestProperty);
		assertNotNull(property);
		assertTrue(property.getAxis().getX() == requestProperty.getX());
		assertTrue(property.getAxis().getY() == requestProperty.getY());
		assertTrue(property.getBaths() == requestProperty.getBaths());
		assertTrue(property.getBeds() == requestProperty.getBeds());
		assertTrue(property.getSquareMeters() == requestProperty.getSquareMeters());
	}

	@Test
	public void copyProperties_whenPropertyIsNull_shouldNotReturnError() {
		final Optional<ResponseProperty> optional = Utils.copyProperties(PropertyUtils.getNullProperty());
		assertFalse(optional.isPresent());
	}

	@Test(expected = IllegalArgumentException.class)
	public void copyProperties_whenPropertyHasIdNull_shouldExpectedIllegalArgumentException() {
		final Property property = PropertyUtils.getValidProperty(null);
		Utils.copyProperties(property);
	}

	@Test(expected = IllegalArgumentException.class)
	public void copyProperties_whenPropertyHasAxisNull_shouldExpectedIllegalArgumentException() {
		final Property property = PropertyUtils.getPropertyWithNullAxis();
		Utils.copyProperties(property);
	}

	@Test
	public void test_copyProperties_property2PropertyDTO_withValidValue_shouldReturnError() {
		final Property property = PropertyUtils.getValidProperty(1L);
		final Optional<ResponseProperty> optional = Utils.copyProperties(property);
		assertTrue(optional.isPresent());
		final ResponseProperty ResponseProperty = optional.get();

		assertTrue(property.getId().intValue() == ResponseProperty.getId());
		assertTrue(property.getAxis().getX() == ResponseProperty.getX());
		assertTrue(property.getAxis().getY() == ResponseProperty.getY());
		assertTrue(property.getBaths() == ResponseProperty.getBaths());
		assertTrue(property.getBeds() == ResponseProperty.getBeds());
		assertTrue(property.getSquareMeters() == ResponseProperty.getSquareMeters());
	}

}
