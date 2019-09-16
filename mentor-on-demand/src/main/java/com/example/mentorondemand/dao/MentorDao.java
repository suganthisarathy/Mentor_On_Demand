package com.example.mentorondemand.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mentorondemand.model.MentorRegistration;


@Repository
public interface MentorDao extends JpaRepository<MentorRegistration,Integer> {

	List<MentorRegistration> findByEmail(String email);
	@Query("select m from MentorRegistration m where m.technologiesKnown like %:technology%")
	List<MentorRegistration> getMentorListWithPattern(@Param("technology")String technology);
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("Update MentorRegistration SET active = 1 where  mentorId=:mentorId")
	void blockMentor(@Param("mentorId")int mentorId);
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("Update MentorRegistration SET active = 0 where  mentorId=:mentorId")
	void unBlockMentor(@Param("mentorId")int mentorId);
}
