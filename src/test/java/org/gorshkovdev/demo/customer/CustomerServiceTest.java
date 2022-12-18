package org.gorshkovdev.demo.customer;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
@SpringBootTest
public class CustomerServiceTest {

  @SuppressWarnings("unused")
  @Autowired
  private CustomerService service;

  @Test
  public void getCustomerById_shouldThrowsCustomerNotFoundException() {
    assertThrows(CustomerNotFoundException.class, () -> service.getCustomerById(42L));
  }
}
