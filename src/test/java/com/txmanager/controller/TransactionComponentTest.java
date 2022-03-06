package com.txmanager.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import static io.restassured.RestAssured.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TransactionComponentTest {
	@LocalServerPort
	private int port;

	
	@Test
	void testApplicationEndToEnd() 
	{
		given()
		.get("http://localhost:8080/transactions/12345")
		.then()
        .statusCode(Matchers.is(200));

	}
}
