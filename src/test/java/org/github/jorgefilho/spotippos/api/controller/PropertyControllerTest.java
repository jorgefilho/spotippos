package org.github.jorgefilho.spotippos.api.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;
import org.github.jorgefilho.spotippos.api.service.PropertyService;
import org.github.jorgefilho.spotippos.api.utils.RequestPropertyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(PropertyController.class)
public class PropertyControllerTest {

	@Autowired
	private ObjectMapper mapper;

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PropertyService propertyService;

	@Test
	public void testPost() throws Exception {
		RequestProperty requestProperty = RequestPropertyUtils.getValidProperty();
		ResponseProperty responseProperty = new ResponseProperty();

		given(this.propertyService.save(requestProperty)).willReturn(responseProperty);

		this.mockMvc.perform(post("/properties")
				.content(mapper.writeValueAsString(requestProperty))
				.contentType(APPLICATION_JSON)
				.accept(APPLICATION_JSON))
				.andExpect(status().isCreated());
	}
}
