package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LeaningNewReportRepository;
import com.example.demo.entitiy.LeaningNewReportEntity;
import com.example.demo.entitiy.LeaningNewReportForm;



	@Service
	public class LeaningNewReportService{
		
	    @Autowired
	    LeaningNewReportRepository leaningNewReportRepository ;		
//		public List<LeaningNewReportEntity> serchAll() {
//			return leaningNewReportRepository.findAll();
//		}
//
//		public LeaningNewReportEntity findById(Date created_at) {
//			return leaningNewReportRepository.findById(created_at).get();
//		}

		//学習新規登録

		public  void insert(LeaningNewReportForm reportForm) {
			LeaningNewReportEntity user = new LeaningNewReportEntity();
			user.setCreated_at(reportForm.getCreated_at());
			user.setStart_time(reportForm.getStart_time());
			user.setEnd_time(reportForm.getEnd_time());
			user.setCourse_id(reportForm.getCourse_id());
			user.setChapters_id(reportForm.getChapters_id());
			user.setText_id(reportForm.getText_id());
			leaningNewReportRepository.save(user);
		}

		
	}
		