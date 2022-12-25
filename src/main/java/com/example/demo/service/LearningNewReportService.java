package com.example.demo.service;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LearningNewReportEntity;
import com.example.demo.entity.LearningNewReportForm;
import com.example.demo.repository.ChapterRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LearningNewReportRepository;
import com.example.demo.repository.TextRepository;

@Service
public class LearningNewReportService {
	@Autowired
	LearningNewReportRepository learningNewReportRepository;

	@Autowired
	ChapterRepository chapterrepository;

	@Autowired
	CourseRepository courserepository;

	@Autowired
	TextRepository textrepository;

	public void insert(LearningNewReportForm LearningNewReportForm) {

		LearningNewReportEntity user = new LearningNewReportEntity();
		  user.setRema(LearningNewReportForm.getRema());
		  //    user.setUser_id(LearningNewReportForm.getUser_id());
		  user.setUser_id(1);
		  user.setCreated_at(LearningNewReportForm.getCreated_at());
		  user.setStart_time(LocalTime.parse(LearningNewReportForm.getStart_time().substring(0,5)+":00"));
		  user.setEnd_time(LocalTime.parse(LearningNewReportForm.getEnd_time().substring(0, 5) + ":00"));
		  user.setCourse_id(LearningNewReportForm.getCourse_id());
		  user.setText_id(LearningNewReportForm.getText_id());
		  user.setChapters_id(LearningNewReportForm.getChapters_id());
		  user.setRemark(LearningNewReportForm.getRemark());
		  Long minutes = ChronoUnit.MINUTES.between(user.getStart_time(), user.getEnd_time());
		  Long totalH = minutes/60;
		  int totalHour = Math.toIntExact(totalH);
		  Long totalM = minutes%60;
		  int totalMinites = Math.toIntExact(totalM);
		  LocalTime total =  LocalTime.of(totalHour,totalMinites);
		  //String str = new SimpleDateFormat("HH:mm:ss").format(total);
		  //LocalTime timeT = LocalTime.parse(str, DateTimeFormatter.ofPattern("HH:mm:ss"));
		  //learningReport.setTotal_time(timeT);
		  user.setTotal_time(total);


		  learningNewReportRepository.save(user);
		 }}
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
