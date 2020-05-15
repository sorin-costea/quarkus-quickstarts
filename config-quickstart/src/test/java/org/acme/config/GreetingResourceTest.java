package org.acme.config;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingResourceTest {
	Logger LOGGER = LoggerFactory.getLogger(GreetingResourceTest.class);
    @Test
    public void testHelloEndpoint() {
    	LOGGER.trace("TRACE");
    	LOGGER.debug("DEBUG");
    	LOGGER.info("INFO");
    	LOGGER.error("ERROR");
        given()
                .when().get("/greeting")
                .then()
                .statusCode(200)
                .body(is("hello quarkus!"));
    }

}
