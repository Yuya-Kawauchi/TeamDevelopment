package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user_tb")
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