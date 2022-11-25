package com.example.demo.entity;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserEditForm {
	
	@NotEmpty(message = "id ")
	private Integer user_id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String password;
	
	@NotEmpty(message = "メールアドレスが入力されていません")
	private String mail_address;
	
}

