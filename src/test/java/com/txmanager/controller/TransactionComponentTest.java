package com.txmanager.controller;

import static org.junit.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.txmanager.TransactionManagerApplication;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest(classes = {TransactionManagerApplication.class})
class TransactionComponentTest {

	@Test
	void testApplicationEndToEnd() 
	{	
		given()
		.get("http://localhost:8080/transactions/12345")
		.then()
        .statusCode(Matchers.is(200));
	}
}