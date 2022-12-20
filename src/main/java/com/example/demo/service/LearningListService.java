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
	

//	  public List<Learningform> findAll() {
//		  
//	    return learningFormRepository.findAll(Sort.by(Sort.Direction.DESC, "rema"));
//	  }
	  
	  public List<LearningReport> findAll() {
		  
		    return learningListRepository.findAll(Sort.by(Sort.Direction.DESC, "rema"));
		  }
	  
	  public Optional<LearningReport> findById(Integer user_id) {
		  
		    return learningListRepository.findById(user_id);
		  }
	  
	  public Optional<LearningReport> selectById(Integer rema) {
		 return learningListRepository.findById(rema);
	  }
	  
////	  総時間
//	  public List<LearningReport> findAllTotal(LearningReport form) {
//			
////			SimpleDateFormat sdFormat = new SimpleDateFormat("hh:mm:ss");
//		  LearningReport learningReport = new LearningReport();
//		  	
//			learningReport.setRema(form.getRema());
//		    learningReport.setUser_id(form.getUser_id());
////			learningReport.setRema(1);
////			learningReport.setUser_id(1);
//			learningReport.setCreated_at(form.getCreated_at());
//			learningReport.setStart_time(form.getStart_time());
//			learningReport.setEnd_time(form.getEnd_time());
//			learningReport.setCourse_id(form.getCourse_id());
//			learningReport.setRemark(form.getRemark());
//			
//		    Long minutes = ChronoUnit.MINUTES.between(learningReport.getEnd_time(), learningReport.getStart_time());
//		    Date total = new Date(minutes);
//		    Date total_time;
//		    learningReport.setTotal_time(total);
//		    
//			return learningListRepository.findAll(Sort.by(Sort.Direction.DESC, "rema"));
//		}
//	  
	  public void delete(Integer rema){
//		 Optional<LearningReport> learningReport = learningListRepository.findById(rema);
		 learningListRepository.deleteById(rema);
	  }
	  
}
