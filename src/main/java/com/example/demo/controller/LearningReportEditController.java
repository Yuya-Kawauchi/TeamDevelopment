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
import com.example.demo.entity.Learningform;
import com.example.demo.entity.Texts;
import com.example.demo.service.LearningListService;
import com.example.demo.service.LearningReportEditService;


@Controller
public class LearningReportEditController {

	@Autowired
	private LearningReportEditService learningReportEditService;
	@Autowired
	private LearningListService learningListService;
	
	
	  @GetMapping("/learningReportEdit")
	  public String  showLearningEdit( @ModelAttribute("rema") Integer rema ,Model model ) {
//	form = learningReportEditService.selectById(rema);
	    
	    Optional<LearningReport> form = learningListService.selectById(rema);
//	    LearningReport learningReport = new LearningReport();
//	    learningReport.setCreated_at(form,getCreated_at());
	    model.addAttribute("form",form);
	    List<Chapters> chapter = learningReportEditService.findChapter();
	    model.addAttribute("chapter", chapter);
	    
	    List<Course> course = learningReportEditService.findCourse();
	    model.addAttribute("course", course);
	    
	    List<Texts> texts = learningReportEditService.findTexts();
	    model.addAttribute("texts", texts);
	    return "learningReportEdit";
	  }
//	  
	

	 
	  @PostMapping("/learningReportEditUpdate")
	  public String postLearningEdit(@ModelAttribute Learningform form,Course course,Chapters chapter,Texts texts, Model model) {
//			
//			if (result.hasErrors()) {
//				
//				return "redirect:/learningReportEdit";
//			}


		    
			learningReportEditService.update(form);
			model.addAttribute("form",form);
			return "topPage";
	  }

	  @PostMapping(path = "/learningReportEditUpdate", params = "back")
	  public String back() {
		  return "redirect:/learningReportList";
	  }
	
}
