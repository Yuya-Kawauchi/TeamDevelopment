package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LearningReport;


@Repository
public interface LearningListRepository
    extends JpaRepository <LearningReport,Integer> {
//	public Iterator<LearningReport> findByUser_id(Integer userId); 
//	List<LearningReport> findByUser_id(Integer user_id);
//	List<LearningReport> findByOrderByRemaAsc();
	
    @Query(value = "SELECT rema,user_id,created_at,start_time,end_time,course_id,remark,total_time FROM report WHERE report.user_id = user_id ",nativeQuery = true)
    List<LearningReport> findByuser_id(Integer user_id);
	
	
//	
}