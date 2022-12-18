package com.example.demo.service;


import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Chapters;
import com.example.demo.entity.Course;
import com.example.demo.entity.LearningNewReportEntity;
import com.example.demo.entity.LearningNewReportForm;
import com.example.demo.entity.LearningReport;
import com.example.demo.entity.Texts;
import com.example.demo.repository.ChapterRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LearningNewReportRepository;
import com.example.demo.repository.TextRepository;


	@Service
	public class LearningNewReportService{
			@Autowired
			LearningNewReportRepository learningNewReportRepository;
			
			@Autowired
			ChapterRepository chapterrepository;
			
			@Autowired
			CourseRepository courserepository;
			
			@Autowired
			TextRepository textrepository;
			
			
			
			public Optional<LearningNewReportEntity> selectById(Integer rema) {
				return learningNewReportRepository.findById(rema);
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
			
			public void insert(LearningNewReportForm form) {
			
				LearningNewReportEntity user = new LearningNewReportEntity();
				user.setRema(form.getRema());
				user.setUser_id(form.getUser_id());
			    user.setCreated_at(form.getCreated_at());
			    user.setStart_time(LocalTime.parse(form.getStart_time().substring(0,5)+":00"));
			    user.setEnd_time(LocalTime.parse(form.getEnd_time().substring(0,5)+":00"));
			    user.setCourse_id(form.getCourse_id());
			    user.setRemark(form.getRemark());				
				learningNewReportRepository.save(user);
			}
		}
//	    @Autowired 
//	    LearningNewReportRepository leaningNewReportRepository ;		
//		public List<LearningNewReportEntity> serchAll() {
//			return learningNewReportRepository.findAll();
//		}
//
//		public LearningNewReportEntity findById(Date created_at) {
//			return LearningNewReportRepository.findById(created_at).get();
//		}
//
//		public  void insert(LearningNewReportForm reportForm) {
//			LearningNewReportEntity user = new LearningNewReportEntity();
//			user.setCreated_at(reportForm.getCreated_at());
//			user.setStart_time(reportForm.getStart_time());
//			user.setEnd_time(reportForm.getEnd_time());
//			user.setCourse_id(reportForm.getCourse_id());
//			user.setChapters_id(reportForm.getChapters_id());
//			user.setText_id(reportForm.getText_id());
//			learningNewReportRepository.save(user);	
//	}	
//		public  void insert(LearningNewReportForm reportForm) {
//			CouseEntity user = new CouseEntity();
//			
//		user.setCourseId(reportForm.getCourse_id());
//			user.setChaptersId(reportForm.getChapters_id());
//			user.setTextId(reportForm.getText_id());
//			LearningNewReportRepository.save(user);
//			}
	