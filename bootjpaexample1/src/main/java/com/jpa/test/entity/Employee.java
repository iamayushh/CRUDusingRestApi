package com.jpa.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
@Id
private int ID;
private String FirstName;
private String LastName;
private String Adress;
private String FathersName;
private String Status;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getAdress() {
	return Adress;
}
public void setAdress(String adress) {
	Adress = adress;
}
public String getFathersName() {
	return FathersName;
}
public void setFathersName(String fathersName) {
	FathersName = fathersName;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public Employee(int iD, String firstName, String lastName, String adress, String fathersName, String status) {
	super();
	ID = iD;
	FirstName = firstName;
	LastName = lastName;
	Adress = adress;
	FathersName = fathersName;
	Status = status;
}
@Override
public String toString() {
	return "Employee [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Adress=" + Adress
			+ ", FathersName=" + FathersName + ", Status=" + Status + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
