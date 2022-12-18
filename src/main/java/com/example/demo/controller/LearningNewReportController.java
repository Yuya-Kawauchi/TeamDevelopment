package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Chapters;
import com.example.demo.entity.Course;
import com.example.demo.entity.LearningReport;
import com.example.demo.entity.Texts;
import com.example.demo.service.LearningNewReportService;

@Controller
public class LearningNewReportController {

	@Autowired
	private LearningNewReportService learningNewReportService;
	
	  @GetMapping("/learningReportEdit")
	  public String  showLearningEdit( @ModelAttribute("rema") Integer rema ,Model model ) {
//	form = learningReportEditService.selectById(rema);
	    
	    Optional<LearningReport> form = learningNewReportService.selectById(rema);
//	    LearningReport learningReport = new LearningReport();
//	    learningReport.setCreated_at(form,getCreated_at());
	    model.addAttribute("form",form);
	    List<Chapters> chapter = learningNewReporttService.findChapter();
	    model.addAttribute("chapter", chapter);
	    
	    List<Course> course = learningNewReportService.findCourse();
	    model.addAttribute("course", course);
	    
	    List<Texts> texts = learningNewReportService.findTexts();
	    model.addAttribute("texts", texts);
	    return "learningReportEdit";
	  }
//	  
	

	 
	  @PostMapping("//leaningnerreport")
	  public String postLearningEdit(@ModelAttribute Learningform form,Course course,Chapters chapter,Texts texts, Model model) {
//			
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
	
