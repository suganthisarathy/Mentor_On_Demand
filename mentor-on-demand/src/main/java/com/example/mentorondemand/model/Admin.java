package com.example.mentorondemand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int courseId;
private String email;
private String Password;
private String courseName;
private float courseRate;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public float getCourseRate() {
	return courseRate;
}
public void setCourseRate(float courseRate) {
	this.courseRate = courseRate;
}

}
