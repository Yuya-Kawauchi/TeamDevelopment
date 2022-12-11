package com.example.demo.entity;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class UserEditForm {
	
	@NotEmpty
	private Integer user_id;
	
	@NotEmpty
	@Size(max = 20, message = "名前は25桁以内で入力してください")
    private String name;
	
	@NotEmpty
	@Size(min = 1, max = 100)
	private String password;
	
	@Email
	@NotEmpty
	@Size(min = 1, max = 50)
	private String mail_address;
	
	@EqualsAndHashCode(callSuper=false)
	public class UserUpdateRequest extends UserEditForm implements Serializable {
}}