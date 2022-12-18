package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;


@Service
public class ToppageService {
	
	@Autowired
	  private  UserRepository userRepository;
	
	 public List<UserEntity> searchAll() {
		    return userRepository.findAll();
		  }
	 
	 public UserEntity findById(Integer user_id) {
			return userRepository.findById(user_id).get();
		}	
//	 public List<UserEntity> findAccountByYearAndMonth(String year, String month) {
//
//
//	        int yearInt = Integer.parseInt(year);
//	        int monthInt = Integer.parseInt(month);
//	        String startDate = year + "-" + month + "-" + "01";
//	        Calendar calendar = Calendar.getInstance();
//	        calendar.set(Calendar.YEAR, yearInt);
//	        calendar.set(Calendar.MONTH, monthInt - 1);
//	        int result = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//	        String endDate = year + "-" + month + "-" + result;
//	        List<UserEntity> list = dao.findAccountByYearAndMonth(startDate, endDate);
//            Object totalPrice = 0;
//	        for (UserEntity account : list) {
//	            totalPrice += account.getName();
//	        }
//	        return list;
//
//	    }
}
