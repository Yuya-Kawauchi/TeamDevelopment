package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.entity.UserEditForm;
import com.example.demo.service.UserEditService;


@Controller
public class UserEditController {

	@Autowired
	UserEditService userEditService;

	@GetMapping("/top")
	public String getHome() {
		//トップページにいくよ
		return "topPage";
	}

	@GetMapping("/userlist/{user_id}")
	public String getUseEdit(@PathVariable Integer user_id, Model model) {
		//ユーザー一覧の生成
		UserEditEntity user = userEditService.findById(user_id);
		UserEditForm userEditForm = new UserEditForm();
		userEditForm.setUser_id(user.getUser_id());
		userEditForm.setName(user.getName());
		userEditForm.setName_kana(user.getName_kana());
		userEditForm.setPassword(user.getPassword());
		userEditForm.setMail_address(user.getMail_address());
		model.addAttribute("UserEditForm", userEditForm);
		return "/UserEdit";
	}

	@RequestMapping("/userEdit/complete")
	public String update(@Validated @ModelAttribute UserEditForm userEditform , BindingResult result, Model model ) {
//		if (result.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//			model.addAttribute("validationError", errorList);
//			return "/UserEdit";
//		}
		userEditService.update(userEditform); 
		model.addAttribute("UserEditForm", userEditform);
		return "/topPage";
	}
}