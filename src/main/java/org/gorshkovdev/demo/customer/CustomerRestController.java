package org.gorshkovdev.demo.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
@RequiredArgsConstructor
@RestController
public class CustomerRestController {

  private static final record Dto(long id, String email, String password) {

  }

  private final CustomerService service;

  @GetMapping("/api/v1/customers/{customerId}")
  public ResponseEntity<Dto> getCustomer(@PathVariable("customerId") long customerId) {
    Customer customer = service.getCustomerById(customerId);
    Dto dto = new Dto(customer.getId(), customer.getEmail(), customer.getPassword());
    return ResponseEntity.ok(dto);
  }
}
