package com.example.Controller;

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
import entity.LearningReport;

@Controller
public class LearningReportEditController {

	@Autowired
	private LearningReportEditService learningReportEditService;
	
	  @GetMapping("/learningReportEdit")
	  public String  showLearningEdit(@RequestParam Integer rema, Model model ,java.util.Optional<LearningReport> learningReport) {
	learningReport = learningReportEditService.selectById(rema);
	    model.addAttribute(learningReport);
	    return "learningReportEdit";
	  }
	  
	  @PostMapping("/Toppage")
	  public String postLearningEdit(@ModelAttribute @Validated LearningReport learningReport, BindingResult result,Model model) {
			
			if (result.hasErrors()) {
				
				return "redirect:/learningReportEdit";
			}
			learningReportEditService.update(learningReport);
			return "redirect:/Toppage";
	  }
			
			
	  @PostMapping(path = "/learningReportList", params = "back")
	  public String back() {
		  return "redirect:/learningReportList";
	  }
	
}
