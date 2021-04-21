package com.example;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
class SpringBootOnJenkinsApplicationTests {
	
	private MockMvc mockMvc;

	@InjectMocks
	private UnitResource unitResource;

	@Test
	void contextLoads() {
		mockMvc = MockMvcBuilders.standaloneSetup(unitResource).build();
		System.out.println("Mock Mvc Objects = " + mockMvc);
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/unit"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Unit Testing"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testUnitJson() {
		mockMvc = MockMvcBuilders.standaloneSetup(unitResource).build();
		System.out.println("Unit Mock Testing Json");
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/unit/json").accept(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.id", Matchers.is(Integer.valueOf("1"))))
			.andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Jazz")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
