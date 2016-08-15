package org.github.jorgefilho.spotippos.api.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.github.jorgefilho.spotippos.api.SpotiposApiApplication;
import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.utils.RequestPropertyUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpotiposApiApplication.class)
public class PropertyControllerTest {

	@Autowired
	private ObjectMapper mapper;

	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testPost() throws Exception {
		final RequestProperty requestProperty = RequestPropertyUtils.getValidRequestProperty();

		this.mockMvc.perform(post("/properties")
				.content(mapper.writeValueAsString(requestProperty))
				.contentType(APPLICATION_JSON)
				.accept(APPLICATION_JSON))
				.andExpect(status().isCreated());
	}
}
