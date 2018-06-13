/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author TTTDEMIRCI
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RouterTest  {

	@Autowired
	private TestRestTemplate restTemplate;
	
	
	@Test
	public void testCamelRest() {
		
		ResponseEntity<String> response=restTemplate.getForEntity("/login/turkmen", String.class);
		assertEquals(200, response.getStatusCode().value());
	}
	


}
