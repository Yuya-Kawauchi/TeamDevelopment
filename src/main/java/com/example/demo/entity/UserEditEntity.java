package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table
(name = "user")
public class UserEditEntity {
	
	  /**
	   * ID
	   */
	  @Id
	  @Column(name = "id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
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
	  @Column(name = "emailaddress")
	  private String emailaddress;
	 
	}