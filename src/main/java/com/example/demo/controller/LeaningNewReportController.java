package com.example.demo.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.entitiy.LeaningNewReportForm;
import com.example.demo.service.LeaningNewReportService;

	/**
	 * @author haruc
	 *
	 */

	@Controller
	public class LeaningNewReportController {
		 @Autowired
		 LeaningNewReportService  leaningnewReportService;
		 
	    @GetMapping("/leaningnewreport")
	    public String getleaningnewreport(@ModelAttribute Model model) {

	        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
	        model.addAttribute("contents", "login/home :: home_contents");
	        return "login/homeLayout";
	    }

	    @GetMapping("/leaningnewreport")
	    public String getleaningmewreport(@ModelAttribute Model model,LeaningNewReportForm form) {
	        model.addAttribute("created_at");
	        model.addAttribute("startTime");
	        model.addAttribute("endTime");
	        model.addAttribute("course_id");
	        model.addAttribute("chapters_id");
	        model.addAttribute("text_id");
	        leaningnewReportService.insert(form); 
	        return "/LeaningNewReport";
	    }
	}

