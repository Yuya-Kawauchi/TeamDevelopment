package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserRequest;
import com.example.demo.service.SignupService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class SignupController {

	@Autowired
	private SignupService userService;

	@Autowired
	private UserRequest userRequest;

	/**
	 * ログイン画面を表示
	 * 
	 * @param model Model
	 * @return ログイン画面
	 */
	@GetMapping("/login")
	public String displayList() {
		return "login";
	}

	/**
	 * ユーザー新規登録画面を表示
	 * 
	 * @param model Model
	 * @return ユーザー情報一覧画面
	 */
	@GetMapping("/user/add")
	public String displayAdd(Model model) {
		model.addAttribute("userRequest", new UserRequest());
		return "NewRegister";
	}

	/**
	 * ユーザー新規登録
	 * 
	 * @param userRequest リクエストデータ
	 * @param model       Model
	 * @return ユーザー情報一覧画面
	 */
	@RequestMapping("/user/create")
	public String create(@Validated @ModelAttribute UserRequest userRequest, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : bindingResult.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("userRequest",userRequest);
			model.addAttribute("validationError", errorList);
			return "/NewRegister";
		}
		// ユーザー情報の登録
		userService.create(userRequest);

		return "redirect:/login";
	}
}//