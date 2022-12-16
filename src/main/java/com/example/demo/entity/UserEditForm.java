package com.example.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class UserEditForm {
	
	private Integer user_id;
	
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 25, message = "名前は25桁以内で入力してください")
    private String name;
	
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 25, message = "名前は25桁以内で入力してください")
    private String name_kana;
	
	@NotEmpty(message = "パスワードを入力してください")
	@Size(min = 1, max = 100, message= "パスワードを100文字以内で入力してください")
	private String password;
	
	@Email
	@NotEmpty(message = "メールアドレスを入力してください")
	@Size(min = 1, max = 50, message = "メールアドレスを50字以内で入力してください")
	private String mail_address;
	
	}