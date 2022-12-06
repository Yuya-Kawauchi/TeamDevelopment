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
	    	if (result.hasErrors()) {
		        // 入力チェックエラーの場合
		        List<String> errorList = new ArrayList<String>();
		        for (ObjectError error : result.getAllErrors()) {
		          errorList.add(error.getDefaultMessage());
		        }
		        model.addAttribute("validationError", errorList);
		        return "/LeaningNewReport";
		      }    
	      // ユーザー情報の登録
	    leaningnewReportService.insert(form);
	   //model.addAttribute("LeaningNewReportForm", form);
	      return "/topPage";
	    }
	}
	