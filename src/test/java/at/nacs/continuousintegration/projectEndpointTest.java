package at.nacs.continuousintegration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class projectEndpointTest {
  @Autowired
  TestRestTemplate restTemplate;

  @Test
  void get() {
    String url="/";
    String acual = restTemplate.getForObject(url, String.class);
    String expected = "Hi nacs";
    assertEquals(expected,acual);

  }
}