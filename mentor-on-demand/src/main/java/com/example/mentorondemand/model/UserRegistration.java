package com.example.mentorondemand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table()
public class UserRegistration {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private boolean active;
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
private String userName;
@NotEmpty
private String password;
@NotEmpty
@Email
private String email;

private String phone;
@Override
public String toString() {
	return "UserRegistration [id=" + id + ", userName=" + userName + " password=" + password + ", email=" + email
			+ ", phone=" + phone + "]";
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
