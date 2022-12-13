package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LearningReport;
import com.example.demo.Repository.LearningListRepository;


@Service
public class LearningListService {
	 @Autowired
	  private LearningListRepository learningListRepository;

	  public List<LearningReport> findAll() {
	    return learningListRepository.findAll();
	  }
	  
	  public Optional<LearningReport> selectById(Integer rema) {
		 return learningListRepository.findById(rema);
	  }
	  
	  public void delete(Integer rema){
//		 Optional<LearningReport> learningReport = learningListRepository.findById(rema);
		 learningListRepository.deleteById(rema);
	  }
	  
}
