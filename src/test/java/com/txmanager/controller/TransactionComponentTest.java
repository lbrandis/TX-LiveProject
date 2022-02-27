package com.txmanager.controller;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import io.restassured.common.mapper.TypeRef;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TransactionComponentTest {
	@LocalServerPort
	private int port;
	
	@Test
	void testApplicationEndToEnd() {
		
		List<Map<String, Object>> transactions = given()
			.port(port)
			.pathParam("accountNumber", 12345).
		when()
			.get("/transactions/{accountNumber}").as(new TypeRef<List<Map<String, Object>>>() {});
		
		assertEquals(transactions.get(0).get("type"), "Credit");
		assertEquals(transactions.get(0).get("amount"), 100.0);
	}

}
