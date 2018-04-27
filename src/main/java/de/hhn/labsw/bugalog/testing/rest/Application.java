package de.hhn.labsw.bugalog.testing.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 27.04.2018
 *
 * @author SWirries
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
  private static final org.slf4j.Logger log =
      org.slf4j.LoggerFactory.getLogger(Application.class.getName());

  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(Application.class);
  }

  //}@SpringBootApplication
//public class Application {
//  private static final org.slf4j.Logger log =
//      org.slf4j.LoggerFactory.getLogger(Application.class.getName());
//
//  public static void main(String[] args) {
//    SpringApplication.run(Application.class,args);
//  }
}
