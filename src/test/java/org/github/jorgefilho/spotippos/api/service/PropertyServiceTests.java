package org.github.jorgefilho.spotippos.api.service;

import org.github.jorgefilho.spotippos.api.SpotiposApiApplication;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;
import org.github.jorgefilho.spotippos.api.utils.RequestPropertyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpotiposApiApplication.class)
public class PropertyServiceTests {

	@Autowired
	private PropertyService propertyService;

	@Test
	public void save_whenRequestPropertyIsValid_shouldReturnResponsePropertySaved() {
		ResponseProperty responseProperty = propertyService.save(RequestPropertyUtils.getValidRequestProperty());

		Assert.notNull(responseProperty);
	}

}
