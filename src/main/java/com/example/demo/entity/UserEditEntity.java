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
@Table(name = "user_tb")
public class UserEditEntity {
	
	  /**
	   * ID
	   */
	  @Id
	  @Column(name = "user_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer user_id;
	  /**
	   * 名前
	   */
	  @Column(name = "name")
	  private String name;
	  
	  @Column(name = "name_kana")
	  private String name_kana;
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