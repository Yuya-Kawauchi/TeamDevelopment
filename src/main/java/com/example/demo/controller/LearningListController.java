package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.LearningReport;
import com.example.demo.service.LearningListService;





@Controller
public class LearningListController {
	@Autowired
	private LearningListService learningListService;
	
	  @GetMapping("/learningReportList")
	  public String showLearningList(Model model) {
	    List<LearningReport> learningreport = learningListService.findAll();
	    model.addAttribute("learningreport", learningreport);
	    
	    return "learningReportList";
	  }
	  
	  @PostMapping(path = "learningReportList", params = "edit")
	  public String postLearningList(@RequestParam Integer rema, @ModelAttribute LearningReport learningreport ,Model model) {
		 Optional<LearningReport> form = learningListService.selectById(rema);
		  model.addAttribute("form", form);
		  return "redirect:/learningReportEdit";
	  }
	  
	  @PostMapping(path = "learningReportList", params = "delete")
	  public String deleteLearningReport(@RequestParam Integer rema) {
		  learningListService.delete(rema);
		  return "redirect:/learningReportList";
	  }

}
