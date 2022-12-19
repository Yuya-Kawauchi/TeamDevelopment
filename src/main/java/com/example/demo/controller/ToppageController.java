package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.ToppageService;

@Controller
public class ToppageController {
	
	
	@Autowired
	private ToppageService toppageService;
	 
	@GetMapping("/home")
	public String getHome(Model model) {
		 List<UserEntity> userlist = toppageService.searchAll();
		 model.addAttribute("userlist", userlist);
		return "topPage";
		
	}
	
	  @PostMapping(path = "home", params = "edit")
	  public String postLearningList(RedirectAttributes redirectAttributes,@RequestParam("user_id") Integer user_id)  {
		 
		  
		  redirectAttributes.addFlashAttribute("user_id", user_id);

		  return "redirect:/userlist/{user_id}";
	  }
//	@Autowired
//	private LearningReport learningReport;
//	ResultSet date = learningReport.executeQuery("SELECT created_at FROM report_tb;");

//	@GetMapping("/1")
//    public  UserEntity test1(@AuthenticationPrincipal UserDetails user) {
//        return ResponseEntity.ok().body(new user.setUser_id(userRequest.getUser_id());
//    }

	
}
