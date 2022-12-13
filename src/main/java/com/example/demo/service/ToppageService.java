//
//package com.example.demo.service;
//import java.util.Calendar;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class ToppageService {
//	 public List<Account> findAccountByYearAndMonth(String year, String month) {
//
//	        int yearInt = Integer.parseInt(year);
//	        int monthInt = Integer.parseInt(month);
//	        String startDate = year + "-" + month + "-" + "01";
//	        Calendar calendar = Calendar.getInstance();
//	        calendar.set(Calendar.YEAR, yearInt);
//	        calendar.set(Calendar.MONTH, monthInt - 1);
//	        int result = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//	        String endDate = year + "-" + month + "-" + result;
//	        List<Account> list = dao.findAccountByYearAndMonth(startDate, endDate);
//	        totalPrice = 0;
//	        for (Account account : list) {
//	            totalPrice += account.getPrice();
//	        }
//	        return list;
//
//	    }
//}
