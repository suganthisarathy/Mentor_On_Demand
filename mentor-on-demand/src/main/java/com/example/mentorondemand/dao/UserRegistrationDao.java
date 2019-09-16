package com.example.mentorondemand.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mentorondemand.model.UserRegistration;


@Repository
public interface UserRegistrationDao extends JpaRepository<UserRegistration,Integer> {
	List<UserRegistration> findByEmail(String email);
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("Update UserRegistration SET active = 1 where  id=:userId")
	void blockUser(@Param("userId")int userId);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("Update UserRegistration SET active = 0 where  id=:userId")
	void unBlockUser(@Param("userId")int userId);
}
