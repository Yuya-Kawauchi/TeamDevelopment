package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
//	@GetMapping("/1")
//    public  UserEntity test1(@AuthenticationPrincipal UserDetails user) {
//        return ResponseEntity.ok().body(new user.setUser_id(userRequest.getUser_id());
//    }

	
}
