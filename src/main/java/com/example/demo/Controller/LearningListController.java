package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.LearningReport;
import com.example.demo.Service.LearningListService;





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
	  
	  @PostMapping(path = "edit", params = "edit")
	  public String postLearningList(@RequestParam Integer rema, @ModelAttribute LearningReport learningReport) {
		  learningListService.selectById(rema);
		  return "learningReportEdit";
	  }
	  @PostMapping(path = "learningReportList", params = "delete")
	  public String deleteLearningReport(@RequestParam Integer rema) {
		  learningListService.delete(rema);
		  return "redirect:/learningReportList";
	  }
	  
	  

}
