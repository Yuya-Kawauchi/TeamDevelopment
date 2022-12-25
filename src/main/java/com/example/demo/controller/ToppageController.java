package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ToppageService;

@Controller
public class ToppageController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ToppageService toppageService;
	 
	@GetMapping("/home")
	public String getHome(Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//Principalからログインユーザの情報を取得
		String userName = auth.getName();
		
		UserEntity enteity = new UserEntity();
		 List<UserEntity> userlist = toppageService.searchAll();
		 model.addAttribute("userlist", userlist);
		 
		 UserEntity user= new UserEntity();
		 for (int i = 0; i < userlist.size(); i++) {
			 if(userlist.get(i).getName().equals(userName));
			 user.setUser_id(userlist.get(i).getUser_id());
		 }
		 model.addAttribute("user_id", user.getUser_id());
	
			 
		 
		return "topPage";
	}
	 @PostMapping(path = "/home", params = "list")
	   public String postLearningList()  {
	 
	    return "redirect:/learningReportList";
}
	 @PostMapping(path = "/home", params = "useredit")
	   public String postUsereditt()  {
	 
	    return "redirect:/userlist/1";
}
	 @PostMapping(path = "/home", params = "new")
	   public String postLearningNew()  {
	 
	    return "redirect:/learningNew";
}
	 @PostMapping(path = "/home", params = "logout")
	   public String logout()  {
	 
	    return "redirect:/login";
}
}
//	  @PostMapping(path = "home", params = "edit")
//	  public String postLearningList(RedirectAttributes redirectAttributes,@RequestParam("user_id") Integer user_id)  {
//		 
//		  
//		  redirectAttributes.addFlashAttribute("user_id", user_id);
//
//		  return "redirect:/userlist/{user_id}";
//	  }
//	@Autowired
//	private LearningReport learningReport;
//	ResultSet date = learningReport.executeQuery("SELECT created_at FROM report_tb;");

//	@GetMapping("/1")
//    public  UserEntity test1(@AuthenticationPrincipal UserDetails user) {
//        return ResponseEntity.ok().body(new user.setUser_id(userRequest.getUser_id());
//    }

