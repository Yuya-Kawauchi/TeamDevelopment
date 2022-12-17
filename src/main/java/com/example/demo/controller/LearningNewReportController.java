package com.example.demo.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.service.LearningNewReportService;


	@Controller
	public class LearningNewReportController {
		 @Autowired
		 LearningNewReportService  leaningnewReportService;
		 	 
	    @GetMapping("/leaningnewreport")
	    public String getleaningnewreport(@ModelAttribute Model model) {

	        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
	        model.addAttribute("contents", "login/home :: home_contents");
	        return "login/homeLayout";
	    }
//
//	    @GetMapping("/leaningnewreport")
//	    public String getleaningmewreport(@ModelAttribute  @Validated Model model,BindingResult result,LearningNewReportForm form) {
//	    	if (result.hasErrors()) {
//		        // 入力チェックエラーの場合
//		        List<String> errorList = new ArrayList<String>();
//		        for (ObjectError error : result.getAllErrors()) {
//		          errorList.add(error.getDefaultMessage());
//		        }
//		        model.addAttribute("validationError", errorList);
//		        return "/LeaningNewReport";
//		      }    
	      // ユーザー情報の登録
//	    leaningnewReportService.insert(form);
//	   //model.addAttribute("LeaningNewReportForm", form);
//	      return "/topPage";
	    }
	
