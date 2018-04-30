package de.hhn.labsw.bugalog.testing.rest;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

/**
 * @author 30.04.2018
 **/
@RepositoryEventHandler(Person.class)
public class PersonEventHandler {
  private static final org.slf4j.Logger log =
      org.slf4j.LoggerFactory.getLogger(PersonEventHandler.class.getName());

  @HandleAfterSave
  public void handleAfterSave(Person person){
    log.debug("Handled after Save:"+person);
  }

  @HandleAfterCreate
  public void handleAfterCreate(Person person){
    log.info("Handled after Create:"+person);
    person.generateMailAddresss();
    log.info("Generate Mail:"+person.getMail());
  }
}
