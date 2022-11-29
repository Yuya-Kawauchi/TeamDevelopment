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
	private Integer user_id;
	
	@Column(name = "name")
	private Integer name;
	
	@Column(name = "name_kana")
	private Integer name_kana;

}
