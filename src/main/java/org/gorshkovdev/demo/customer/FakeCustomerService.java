package org.gorshkovdev.demo.customer;

import org.springframework.stereotype.Service;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
@Service
public class FakeCustomerService implements CustomerService {

  private static final Customer FAKE_CUSTOMER = new Customer() {

    @Override
    public long getId() {
      return 0;
    }

    @Override
    public String getEmail() {
      return "gorshkovdev@proton.me";
    }

    @Override
    public String getPassword() {
      return "";
    }
  };

  @Override
  public Customer getCustomerById(long customerId) {
    if (FAKE_CUSTOMER.getId() == customerId) {
      return FAKE_CUSTOMER;
    }
    throw new CustomerNotFoundException(String.format("can't get customer by id - %s", customerId));
  }
}
