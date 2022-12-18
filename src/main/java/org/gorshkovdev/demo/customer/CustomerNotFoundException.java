package org.gorshkovdev.demo.customer;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
public class CustomerNotFoundException extends RuntimeException {

  public CustomerNotFoundException(String message) {
    super(message);
  }
}
