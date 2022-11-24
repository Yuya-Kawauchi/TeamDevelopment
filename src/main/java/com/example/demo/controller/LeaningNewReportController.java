package com.example.demo.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	    public String getleaningmewreport(@ModelAttribute Model model) {
	        model.addAttribute("date");
	        model.addAttribute("startTime");
	        model.addAttribute("endTime");
	        return "/05";
	    }

	    @PostMapping("/05")
	    public String postLogout() {
	        return "redirect:/05";
	    }

	    @GetMapping("/05")
	    public String getUserListCsv(Model model) {
	        return getleaningnewreport(model);
	    }
	}

