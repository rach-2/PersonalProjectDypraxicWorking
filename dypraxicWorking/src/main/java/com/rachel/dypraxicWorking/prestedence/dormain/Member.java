package com.rachel.dypraxicWorking.prestedence.dormain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;
   
   private String  firstName;
   private String lastName;
   private String type;
   
   public Member(String firstName, String lastName, String type) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.type = type;
}

public long getId() {
	return Id;
}

public void setId(long id) {
	Id = id;
}

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

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
   
   
   
   
  
   
  
   
  
   
   
}
