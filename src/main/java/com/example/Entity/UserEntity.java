package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user_tb")
public class UserEntity {
	
	@Id
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "name_kana")
	private String name_kana; 
	
	@Column(name = "mail_address")
	private String mail_address; 
	
	@Column(name = "password")
	private String password;
	
	public void setName(String user_name) {
		name=user_name;
    }
	public void setAddress(String userMail_address) {
		mail_address=userMail_address;
    }
	public void setpassword(String user_password) {
		password=user_password;
    }
}
