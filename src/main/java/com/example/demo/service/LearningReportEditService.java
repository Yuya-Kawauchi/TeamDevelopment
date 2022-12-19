package com.example.demo.service;

//import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Chapters;
import com.example.demo.entity.Course;
import com.example.demo.entity.LearningReport;
import com.example.demo.entity.Learningform;
import com.example.demo.entity.Texts;
import com.example.demo.repository.ChapterRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LearningReportEditRepository;
import com.example.demo.repository.TextRepository;


@Service
@Transactional
public class LearningReportEditService {
	
	@Autowired
	LearningReportEditRepository learningReportEditRepository;
	
	@Autowired
	ChapterRepository chapterrepository;
	
	@Autowired
	CourseRepository courserepository;
	
	@Autowired
	TextRepository textrepository;
	
	
	
	public Optional<LearningReport> selectById(Integer rema) {
		return learningReportEditRepository.findById(rema);
	}
	
	public List<Chapters> findChapter(){
		return chapterrepository.findAll();
	}
	public List<Course> findCourse(){
		return courserepository.findAll();
	}
	public List<Texts> findTexts(){
		return textrepository.findAll();
	}

	public void putReport(LearningReport form,Course course,Chapters chapter,Texts texts){
		form.setCourse_id(course.getCourse_id());
	}
	
	public void update(Learningform form) {
	
		LearningReport learningReport = new LearningReport();
		
//		SimpleDateFormat sdFormat = new SimpleDateFormat("hh:mm:ss");

		learningReport.setRema(form.getRema());
	    learningReport.setUser_id(form.getUser_id());
//		learningReport.setRema(1);
//		learningReport.setUser_id(1);
		learningReport.setCreated_at(form.getCreated_at());
		learningReport.setStart_time(LocalTime.parse(form.getStart_time().substring(0,5)+":00"));
		learningReport.setEnd_time(LocalTime.parse(form.getEnd_time().substring(0,5)+":00"));
		learningReport.setCourse_id(form.getCourse_id());
		learningReport.setRemark(form.getRemark());
		

		
		learningReportEditRepository.save(learningReport);
	}
}
