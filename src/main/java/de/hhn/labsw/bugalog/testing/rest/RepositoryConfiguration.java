package de.hhn.labsw.bugalog.testing.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 30.04.2018
 **/
@Configuration
public class RepositoryConfiguration {
  private static final org.slf4j.Logger log =
      org.slf4j.LoggerFactory.getLogger(RepositoryConfiguration.class.getName());

  @Bean
  PersonEventHandler personEventHandler(){
    return new PersonEventHandler();
  }
}
