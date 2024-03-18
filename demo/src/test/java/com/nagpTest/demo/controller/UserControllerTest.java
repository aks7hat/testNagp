package com.nagpTest.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.nagpTest.demo.repository.UserRepository;

@WebMvcTest(UserController.class)
public class UserControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private UserController userController;
	
	@MockBean
	private UserRepository userRespository;
	

	@Test
	public void testIndex() throws Exception {
		mockMvc
		.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("index"));
	}
	
	@Test
	public void testRegister() throws Exception {
		mockMvc
		.perform(get("/register"))
		.andExpect(status().isOk())
		.andExpect(view().name("register"));
	}
	
	@Test
	public void testUsers() throws Exception {
		mockMvc
		.perform(get("/users"))
		.andExpect(status().isOk())
		.andExpect(view().name("users"));
	}

}
