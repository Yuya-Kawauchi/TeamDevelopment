package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEditEntity {
	
	  /**
	   * ID
	   */
	  @Id
	  @Column(name = "user_id")
	  private Integer user_id;
	  /**
	   * 名前
	   */
	  @Column(name = "name")
	  @Size(max = 100, message = "名前は100桁以内で入力してください")
	  private String name;
	  /**
	   * パスワード
	   */
	  @Column(name = "password")
	  private String password;
	  /**
	   * メールアドレス
	   */
	  @Column(name = "mail_address")
	  private String mail_address;
	 
	}