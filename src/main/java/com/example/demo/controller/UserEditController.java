package com.example.demo.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.entity.UserEditForm;
import com.example.demo.service.UserEditService;


	@Controller
	public class UserEditController {

	    @Autowired
	    UserEditService usereditservice;

	    @GetMapping("/useredit")
	    public String getHome() {
	    //トップページにいくよ
	        return "/topPage";
	    }

	    @GetMapping("/userlist")
	    public String getUseEdit(UserEditForm form, Model model) {
	        //ユーザー一覧の生成
	    	UserEditEntity user = usereditservice.findById(form.getUser_id());
	    	UserEditForm usereditform = new UserEditForm();
	    	usereditform.setUser_id(user.getUser_id());
	    	usereditform.setName(user.getName());
//	    	usereditform.setName_kana(user.getName_kana());
	    	usereditform.setPassword(user.getPassword());
	    	usereditform.setMail_address(user.getMail_address());
	        model.addAttribute("userUpdateRequest", usereditform);
	        return "/UserEdit";
	      }
	    
	    @RequestMapping(value="/edit/user",method = RequestMethod.POST)
	    public String update(@Validated @ModelAttribute UserEditForm form , Model model) {
	    	 model.addAttribute("form", form);
			return "/UserEdit";
		}
	}