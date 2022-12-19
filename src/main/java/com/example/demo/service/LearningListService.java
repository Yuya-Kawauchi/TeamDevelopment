package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LearningReport;
import com.example.demo.repository.LearningListRepository;


@Service
public class LearningListService {
	 @Autowired
	  private LearningListRepository learningListRepository;

	  public List<LearningReport> findAll() {
		  
	    return learningListRepository.findAll(Sort.by(Sort.Direction.ASC, "rema"));
	  }
	  
	  public Optional<LearningReport> findById(Integer user_id) {
		  
		    return learningListRepository.findById(user_id);
		  }
	  
	  public Optional<LearningReport> selectById(Integer rema) {
		 return learningListRepository.findById(rema);
	  }
	  
	  public void delete(Integer rema){
//		 Optional<LearningReport> learningReport = learningListRepository.findById(rema);
		 learningListRepository.deleteById(rema);
	  }
	  
}
