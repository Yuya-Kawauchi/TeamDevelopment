package com.example.demo.controller;

	import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
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
	    public String getleaningmewreport(@ModelAttribute  @Validated Model model,BindingResult result,LeaningNewReportForm form) {
	        model.addAttribute("created_at");
	        model.addAttribute("start_time");
	        model.addAttribute("end_time");
	        model.addAttribute("course_id");
	        model.addAttribute("chapters_id");
	        model.addAttribute("text_id");
	        leaningnewReportService.insert(form); 
	        return "/LeaningNewReport";
	    
	    if (result.hasErrors()) {
	        // 入力チェックエラーの場合
	        List<String> errorList = new ArrayList<String>();
	        for (ObjectError error : result.getAllErrors()) {
	          errorList.add(error.getDefaultMessage());
	        }
	        model.addAttribute("validationError", errorList);
	        return "user/add";
	      }
	      // ユーザー情報の登録
	    LeaningNewReportService.insert(form);
	    model.addAttribute("LeaningNewReportForm", form);
	      return "redirect:/user/list";
	    }
	}
	