package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.LearningReport;
import com.example.demo.service.LearningListService;






@Controller
public class LearningListController {
	@Autowired
	private LearningListService learningListService;

	
	  @GetMapping("/learningReportList")
	  public String showLearningList(Model model) {
	    List<LearningReport> learningreport = learningListService.findAll();
	    model.addAttribute("learningreport",learningreport);
	    return "learningReportList";
	  }

	
	
//	  @GetMapping("/learningReportList")
//	  public String showLearningList(Model model) {
//	    List<LearningReport> learningreport = learningListService.findAll();
//	    Long millis = ChronoUnit.MILLIS.between(learningreport.getEnd_time(), learningreport.getStart_time());
//	    Time total = new Time(millis);
//	    Time.toLocalTime​(total);
//	    LearningListform form = new LearningListform();
//	    form.setTotal_time(total);
//	    form.setRema(learningreport.getRema());
//	    form.setUser_id(learningreport.getUser_id());
//	    form.setCreated_at(learningreport.getCreated_at());
//	    form.setStart_time(learningreport.getStart_time());
//	    form.setEnd_time(learningreport.getEnd_time());
//	    form.setCourse_id(learningreport.getCourse_id());
//	    form.setRemark(learningreport.getRemark());
//	    model.addAttribute("form",form);
//	    model.addAttribute("learningreport",learningreport);
//	    return "redirect:/learningReportListp";
//	  }
	
//	  @GetMapping("/learningReportList")
//	  public String showLearningList(Model model) {
//	    List<LearningReport> learningreport = learningListService.findAll();
//	    
//	    form.setRema(learningreport.getRema());
//	    form.setUser_id(learningreport.getUser_id());
//	    form.setCreated_at(learningreport.getCreated_at());
//	    form.setStart_time(learningreport.getStart_time());
//	    form.setEnd_time(learningreport.getEnd_time());
//	    form.setCourse_id(learningreport.getCourse_id());
//	    form.setRemark(learningreport.getRemark());
//	    model.addAttribute("form",form);
//	    model.addAttribute("learningreport",learningreport);
//	    return "redirect:/learningReportListp";
//	  }
//	  
	
//	  @GetMapping("/learningReportList")
//	  public String showLearningList(RedirectAttributes redirectAttributes,Model model) {
//	    List<LearningReport> learningreport = learningListService.findAll();
//	    model.addAttribute("learningreport",learningreport);
//	    redirectAttributes.addFlashAttribute("learningreport",learningreport);
//	    return "redirect:/learningReportListp";
//	  }
//
//	
//	  @GetMapping("/learningReportListp")
//	  public String showLearningListp(@ModelAttribute LearningReport learningreport,Model model) {
//		    Long millis = ChronoUnit.MILLIS.between(learningreport.getEnd_time(), learningreport.getStart_time());
//		    Time total = new Time(millis);
//		    LearningListform form = new LearningListform();
//		    form.setTotal_time(total);
//		    form.setRema(learningreport.getRema());
//		    form.setUser_id(learningreport.getUser_id());
//		    form.setCreated_at(learningreport.getCreated_at());
//		    form.setStart_time(learningreport.getStart_time());
//		    form.setEnd_time(learningreport.getEnd_time());
//		    form.setCourse_id(learningreport.getCourse_id());
//		    form.setRemark(learningreport.getRemark());
//		    model.addAttribute("form",form);
//		    return "learningReportList";
//		  }

	  
	  
//	  @GetMapping("/learningReportList")
//	  public String showLearningListp(@ModelAttribute LearningReport learningreport,Model model) {
//		    Long minutes = ChronoUnit.MINUTES.between(learningreport.getEnd_time(), learningreport.getStart_time());
//		    Time total = new Time(minutes);
//		    LearningListform form = new LearningListform();
//		    form.setTotal_time(total);
//		    form.setRema(learningreport.getRema());
//		    form.setUser_id(learningreport.getUser_id());
//		    form.setCreated_at(learningreport.getCreated_at());
//		    form.setStart_time(learningreport.getStart_time());
//		    form.setEnd_time(learningreport.getEnd_time());
//		    form.setCourse_id(learningreport.getCourse_id());
//		    form.setRemark(learningreport.getRemark());
//		    model.addAttribute("form",form);
//		    return "learningReportList";
//		  }

	  
	  
//	  @GetMapping("/learningReportList")
//	  public String showLearningList(Model model) {
//	    List<LearningReport> learningreport = learningListService.findAll();
//	    model.addAttribute("learningreport",learningreport);
//	    return "redirect:/learningReportListp";
//	  }
//	  
//	  @GetMapping("/learningReportListp")
//	  public String showLearningListp(@ModelAttribute LearningReport learningreport,Model model) {
//		    Long minutes = ChronoUnit.MINUTES.between(learningreport.getEnd_time(), learningreport.getStart_time());
//		    Time total = new Time(minutes);
//		    LearningListform form = new LearningListform();
//		    form.setTotal_time(total);
//		    form.setRema(learningreport.getRema());
//		    form.setUser_id(learningreport.getUser_id());
//   		learningReport.setRema(1);
//	    	learningReport.setUser_id(1);
//		    form.setCreated_at(learningreport.getCreated_at());
//		    form.setStart_time(learningreport.getStart_time());
//		    form.setEnd_time(learningreport.getEnd_time());
//		    form.setCourse_id(learningreport.getCourse_id());
//		    form.setRemark(learningreport.getRemark());
//		    model.addAttribute("form",form);
//		    return "learningReportList";
//		  }
	  
	  
	  
//	  @GetMapping("/learningReportList")
//	  public String showLearningList(@RequestParam("user_id") Integer user_id,Model model) {
//	    Optional<LearningReport> learningreport = learningListService.findById(user_id);
//	    model.addAttribute("learningreport", learningreport);
//
//	    return "learningReportList";
//	  }
//	  
	  
	  
	  @PostMapping(path = "learningReportList", params = "edit")
	  public String postLearningList(RedirectAttributes redirectAttributes,@RequestParam("rema") Integer rema, @ModelAttribute LearningReport learningreport ,Model model) {
		 
		  
		  redirectAttributes.addFlashAttribute("rema", rema);
//		  Optional<LearningReport> form = learningListService.selectById(rema);
//		  model.addAttribute("form", form);
		  return "redirect:/learningReportEdit";
	  }
	  
	  @PostMapping(path = "learningReportList", params = "delete")
	  public String deleteLearningReport(@RequestParam Integer rema) {
		  learningListService.delete(rema);
		  return "redirect:/learningReportList";
	  }

}
