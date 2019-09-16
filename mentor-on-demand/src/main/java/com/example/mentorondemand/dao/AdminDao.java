package com.example.mentorondemand.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mentorondemand.model.Admin;
@Repository
public interface AdminDao extends JpaRepository<Admin,Integer>{

	@Query("select a from Admin a where courseId=:courseId")
	List<Admin>getByCourseId(@Param("courseId")int courseId);

}
