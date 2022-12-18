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
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Chapters;
import com.example.demo.entity.Course;
import com.example.demo.entity.LearningNewReportForm;
import com.example.demo.entity.Texts;
import com.example.demo.service.LearningNewReportService;
import com.example.demo.service.LearningReportEditService;

@Controller
public class LearningNewReportController {

	@Autowired
	private LearningNewReportService learningNewReportService;
	
	@Autowired
	private LearningReportEditService learningReportEditService;

	 @GetMapping("/learningNew")
		  public String  LearningNewReport(Model model ) {
		model.addAttribute("LearningNewReportForm",new LearningNewReportForm());
		//	    LearningReport learningReport = new LearningReport();
		//	    learningReport.setCreated_at(form,getCreated_at());

		List<Chapters> chapter = learningReportEditService.findChapter();
		model.addAttribute("chapter", chapter);

		List<Course> course = learningReportEditService.findCourse();
		model.addAttribute("course", course);

		List<Texts> texts = learningReportEditService.findTexts();
		model.addAttribute("texts", texts);
		return "/LeaningNewReport";
	}
	 
  @PostMapping(path = "/leaningnewreport", params = "back")
  public String back() {
	  return "/topPage";
  }			
	    @GetMapping("/leaningnewreport")
	    public String getleaningmewreport(@ModelAttribute @Validated Model model,BindingResult result,LearningNewReportForm LearningNewReportForm) {
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
	    	learningNewReportService.insert(LearningNewReportForm);
	   model.addAttribute("LearningNewReportForm", LearningNewReportForm);
	      return "/topPage";
}}
	
	
	
	

	
	
	