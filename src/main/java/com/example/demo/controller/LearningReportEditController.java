package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Chapters;
import com.example.demo.entity.Course;
import com.example.demo.entity.LearningReport;
import com.example.demo.entity.Texts;
import com.example.demo.service.LearningReportEditService;


@Controller
public class LearningReportEditController {

	@Autowired
	private LearningReportEditService learningReportEditService;
	
	  @GetMapping("/learningReportEdit")
	  public String  showLearningEdit( Model model ,Optional<LearningReport> form) {
//	form = learningReportEditService.selectById(rema);
	    model.addAttribute(form);
	    
//	    List<Chapters> chapter = learningReportEditService.findChapter();
//	    model.addAttribute("chapter", chapter);
//	    
//	    List<Course> course = learningReportEditService.findCourse();
//	    model.addAttribute("course", course);
//	    
//	    List<Texts> texts = learningReportEditService.findTexts();
//	    model.addAttribute("texts", texts);
	    return "learningReportEdit";
	  }
	  
	  @PostMapping("/learningReportEdit")
	  public String postLearningEdit(@ModelAttribute @Validated LearningReport learningReport,Course course,Chapters chapter,Texts texts, BindingResult result,Model model) {
			
			if (result.hasErrors()) {
				
				return "redirect:/learningReportEdit";
			}
			learningReportEditService.putReport(learningReport,course,chapter,texts);
			learningReportEditService.update(learningReport);
			return "redirect:/Toppage";
	  }

	  @PostMapping(path = "/learningReportList", params = "back")
	  public String back() {
		  return "redirect:/learningReportList";
	  }
	
}
