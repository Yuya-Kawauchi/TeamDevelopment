package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity

@Data
@Table(name = "user_tb")
public class MUser {
		
	 @Id
	 @NotNull
	 @Column(name = "user_id")
	 private Integer user_id;

	 @NotNull
	 @Column(name = "name")
	 private String name;
	 
	 @NotNull
	 @Column(name = "name_kana")
	 private String name_kana ;
	 
	 @NotNull
	 @Column(name = "mail_address")
	 private String mail_address ;
	 
	 @NotNull
	 @Column(name = "password")
	 private String password;
	 
}