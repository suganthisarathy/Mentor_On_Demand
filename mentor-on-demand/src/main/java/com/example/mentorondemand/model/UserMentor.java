package com.example.mentorondemand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserMentor {
@Id
private int userMentorId;
private int userId;
private int mentorId;
private String status;
public int getUserMentorId() {
	return userMentorId;
}
public void setUserMentorId(int userMentorId) {
	this.userMentorId = userMentorId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getMentorId() {
	return mentorId;
}
public void setMentorId(int mentorId) {
	this.mentorId = mentorId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
