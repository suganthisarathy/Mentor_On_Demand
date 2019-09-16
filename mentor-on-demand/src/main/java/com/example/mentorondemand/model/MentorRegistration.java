package com.example.mentorondemand.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MentorRegistration {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int mentorId;
private String name;
private String email;
private String password;
private String mobilenumber;
private int yearsOfExperience;
private String technologiesKnown;
private int trainingsCompleted;
private String linkedInUrl;
private Date fromDate;
private Date toDate;
private String fromTime;
private boolean active;
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
@Override
public String toString() {
	return "MentorRegistration [mentorId=" + mentorId + ", name=" + name + ", email=" + email + ", password=" + password
			+ ", mobilenumber=" + mobilenumber + ", yearsOfExperience=" + yearsOfExperience + ", technologiesKnown="
			+ technologiesKnown + ", trainingsCompleted=" + trainingsCompleted + ", linkedInUrl=" + linkedInUrl
			+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", fromTime=" + fromTime + ", toTime=" + toTime + "]";
}
public int getMentorId() {
	return mentorId;
}
public void setMentorId(int mentorId) {
	this.mentorId = mentorId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public int getYearsOfExperience() {
	return yearsOfExperience;
}
public void setYearsOfExperience(int yearsOfExperience) {
	this.yearsOfExperience = yearsOfExperience;
}
public String getTechnologiesKnown() {
	return technologiesKnown;
}
public void setTechnologiesKnown(String technologiesKnown) {
	this.technologiesKnown = technologiesKnown;
}
public int getTrainingsCompleted() {
	return trainingsCompleted;
}
public void setTrainingsCompleted(int trainingsCompleted) {
	this.trainingsCompleted = trainingsCompleted;
}
public String getLinkedInUrl() {
	return linkedInUrl;
}
public void setLinkedInUrl(String linkedInUrl) {
	this.linkedInUrl = linkedInUrl;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getToDate() {
	return toDate;
}
public void setToDate(Date toDate) {
	this.toDate = toDate;
}
public String getFromTime() {
	return fromTime;
}
public void setFromTime(String fromTime) {
	this.fromTime = fromTime;
}
public String getToTime() {
	return toTime;
}
public void setToTime(String toTime) {
	this.toTime = toTime;
}
private String toTime;



}
