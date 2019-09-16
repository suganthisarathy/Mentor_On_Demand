package com.example.mentorondemand.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.mentorondemand.model.UserMentor;

public interface UserMentoraDao  extends JpaRepository<UserMentor,Integer>{

	  
@Modifying(clearAutomatically = true)
@Transactional
@Query("Update UserMentor SET status = 'accepted' where userId = :userId and mentorId=:mentorId")
void acceptRequest(@Param("userId") int userId,@Param("mentorId") int mentorId);
@Modifying(clearAutomatically = true)
@Transactional
@Query("Update UserMentor SET status = 'rejected' where userId = :userId and mentorId=:mentorId")
void rejectRequest(@Param("userId") int userId,@Param("mentorId") int mentorId);
@Query("select um from UserMentor um where mentorId= :mentorId ")
List<UserMentor> findBymentorId(@Param("mentorId")int mentorId);
List<UserMentor>findByUserId(int id); 
		 

	
	
	

}
