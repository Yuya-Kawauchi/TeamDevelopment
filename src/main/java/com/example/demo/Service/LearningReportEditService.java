package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Repository.LearningReportEditRepository;
import com.example.demo.entity.Chapters;
import com.example.demo.entity.Course;
import com.example.demo.entity.LearningEditForm;
import com.example.demo.entity.LearningReport;
import com.example.demo.entity.Texts;

@Service
@Transactional
public class LearningReportEditService {
	
	@Autowired
	LearningReportEditRepository learningReportEditRepository;
	
	public Optional<LearningReport> selectById(Integer rema) {
		return learningReportEditRepository.findById(rema);
	}
	
//	public List<Chapters> findChapter(){
//		return learningReportEditRepository.findAll();
//	}
//	public List<Course> findCourse(){
//		return learningReportEditRepository.findAll();
//	}
//	public List<Texts> findTexts(){
//		return learningReportEditRepository.findAll();
//	}

	public void putReport(LearningReport learningReport,Course course,Chapters chapter,Texts texts){
		learningReport.setCourse_id(course.getCourse_id());
	}
	
	public void update(LearningReport learningReport) {
		
	
		LearningEditForm form = new LearningEditForm();
		
		form.setRema(learningReport.getRema());
		form.setUser_id(learningReport.getUser_id());
		form.setCreated_at(learningReport.getCreated_at());
		form.setStart_time(learningReport.getStart_time());
		form.setEnd_time(learningReport.getEnd_time());
		form.setCourse_id(learningReport.getCourse_id());
		form.setRemark(learningReport.getRemark());
		
		
		learningReportEditRepository.save(form);
	}
}
