package com.example.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.controller.UserEditContoller;

import lombok.Data;

@Data
public class UserEditForm {
	
	@NotEmpty
	private Integer user_id;
	
	@NotEmpty
	@Size(max = 25, message = "名前は25桁以内で入力してください")
    private String name;
	
	@NotEmpty
	private String password;
	
	@Email
	@NotEmpty
	private String mail_address;
	
@RequestMapping(value="/edit/user-form",method = RequestMethod.POST)
public String update(@Validated @ModelAttribute UserEditContoller form) {
	return null;
}}