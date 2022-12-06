package com.example.demo.service;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitiy.LeaningNewReportEntity;
import com.example.demo.entitiy.LeaningNewReportForm;
import com.example.demo.repository.LeaningNewReportRepository;


	@Service
	public class LeaningNewReportService{
		
	    @Autowired @Lazy
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
			user.setCreatedAt(reportForm.getCreatedAt());
			user.setStartTime(reportForm.getStartTime());
			user.setEndTime(reportForm.getEndTime());
			user.setCourseId(reportForm.getCourseId());
			user.setChaptersId(reportForm.getChaptersId());
			user.setTextId(reportForm.getTextId());
			leaningNewReportRepository.save(user);
		}
	}