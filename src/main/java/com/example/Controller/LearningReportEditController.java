package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.LearningReportEditService;
import entity.Chapters;
import entity.Course;
import entity.LearningReport;
import entity.Texts;

@Controller
public class LearningReportEditController {

	@Autowired
	private LearningReportEditService learningReportEditService;
	
	  @GetMapping("/learningReportEdit")
	  public String  showLearningEdit(@RequestParam Integer rema, Model model ,java.util.Optional<LearningReport> learningReport) {
	learningReport = learningReportEditService.selectById(rema);
	    model.addAttribute(learningReport);
	    
	    List<Chapters> chapter = learningReportEditService.findChapter();
	    model.addAttribute("chapter", chapter);
	    
	    List<Course> course = learningReportEditService.findCourse();
	    model.addAttribute("course", course);
	    
	    List<Texts> texts = learningReportEditService.findTexts();
	    model.addAttribute("texts", texts);
	    return "learningReportEdit";
	  }
	  
	  @PostMapping("/Toppage")
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
