package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Data;
/**
 * ユーザー情報 リクエストデータ
 */
@Data
@Component
public class UserRequest implements Serializable {
	
	
  /**
   * 名前
   */
  @NotEmpty(message = "名前を入力してください")
  @Size(message = "IDを入力してください")
  private String user_id;
  
  @Size(max = 20, message = "名前は20文字以内で入力してください")
  private String name;
  
  @Size(max = 20, message = "名前は20文字以内で入力してください")
  private String name_kana;

  @Size(max = 20, message = "パスワードは20文字以内で入力してください")
  private String password;
  
  @Size(max = 50, message = "アドレスは50文字以内で入力してください")
  private String mail_address;
}