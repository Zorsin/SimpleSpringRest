package de.hhn.labsw.bugalog.testing.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 27.04.2018
 *
 * @author SWirries
 */

@Entity
public class Person {
  private static final org.slf4j.Logger log =
      org.slf4j.LoggerFactory.getLogger(Person.class.getName());
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String firstName;
  private String lastName;
  private String mail;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMail() {
    return mail;
  }

  public void generateMailAddresss(){
    if(mail == null  || mail.equals("")){
      mail = firstName + "." + lastName + "@bugalog.de";
    }

  }

  @Override
  public String toString() {
    return id+" Person: "+firstName + " " + lastName;
  }
}
