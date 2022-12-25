package com.example.demo.entity;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class UserEditForm implements Serializable{
	
	/**
	   * 名前
	   */
	  @NotNull(message = "IDを入力してください")
	  private Integer user_id;
	  
	  @NotEmpty(message = "名前を入力してください")
	  @Size(max = 20, message = "名前は20文字以内で入力してください")
	  private String name;
	  
	  private String name_kana;
	 
	  @NotEmpty(message = "パスワードを入力してください")
	  @Size(max = 20, message = "パスワードは20文字以内で入力してください")
	  private String password;
	  
	  @NotEmpty(message = "メールアドレスを入力してください")
	  @Size(max = 50, message = "アドレスは50文字以内で入力してください")
	  private String mail_address;
	}