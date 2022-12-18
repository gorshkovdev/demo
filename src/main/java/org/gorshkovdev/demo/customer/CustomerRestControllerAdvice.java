package org.gorshkovdev.demo.customer;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
@RestControllerAdvice
public class CustomerRestControllerAdvice {

  @ExceptionHandler(CustomerNotFoundException.class)
  public ProblemDetail handleCustomerNotFoundException(CustomerNotFoundException e) {
    return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
  }
}
