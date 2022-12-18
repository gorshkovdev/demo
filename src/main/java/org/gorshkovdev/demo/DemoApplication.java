package org.gorshkovdev.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(DemoApplication.class);
    application.setBannerMode(Banner.Mode.OFF);
    application.run(args);
  }
}
