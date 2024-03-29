package com.txmanager.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.txmanager.TransactionManagerApplication;

@SpringBootTest(classes = {TransactionManagerApplication.class})
@AutoConfigureMockMvc
class TransactionControllerIntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	

	@Test
	void testGetTransactionsByAccountNumber() throws Exception {
		mvc.perform(get("/transactions/12345"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON));
	}

}
