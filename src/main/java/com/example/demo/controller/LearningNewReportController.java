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

import com.example.demo.entity.LearningNewReportForm;
import com.example.demo.service.LearningNewReportService;

@Controller
public class LearningNewReportController {

	@Autowired
	private LearningNewReportService learningNewReportService;

	@GetMapping("/learningNew")
	public String LearningNewReport( Model model) {
		//	form = learningReportEditService.selectById(rema);
		model.addAttribute("LearningNewReportForm",new LearningNewReportForm());

//		Optional<LearningNewReportEntity> form = learningNewReportService.selectById(rema);
//		//	    LearningReport learningReport = new LearningReport();
//		//	    learningReport.setCreated_at(form,getCreated_at());
//		model.addAttribute("form", form);
//		List<Chapters> chapter = learningNewReportService.findChapter();
//		model.addAttribute("chapter", chapter);
//
//		List<Course> course = learningNewReportService.findCourse();
//		model.addAttribute("course", course);
//
//		List<Texts> texts = learningNewReportService.findTexts();
//		model.addAttribute("texts", texts);
		return "/LeaningNewReport";
	}
//		
//		if (result.hasErrors()) {
//			
//			return "redirect:/learningReportEdit";
//		}
  @PostMapping(path = "/leaningnewreport", params = "back")
  public String back() {
	  return "/topPage";
  }
//			if (result.hasErrors()) {
//				
//				return "redirect:/learningReportEdit";
//			}

//	@Controller
//	public class LearningNewReportController {
//		 @Autowired
//		 LearningNewReportService  leaningnewReportService;
//		 	 
//	    @GetMapping("/leaningnewreport")
//	    public String getleaningnewreport(@ModelAttribute Model model) {
//
//	        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
//	        model.addAttribute("contents", "login/home :: home_contents");
//	        return "login/homeLayout";
//	    }
//
	    @GetMapping("/leaningnewreport")
	    public String getleaningmewreport(@ModelAttribute  @Validated Model model,BindingResult result,LearningNewReportForm form) {
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
	    	learningNewReportService.insert(form);
	   model.addAttribute("LearningNewReportForm", form);
	      return "/topPage";
}}
	
	
	
	
	
	
	
	