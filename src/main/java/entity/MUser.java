package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity

@Data
@Table(name = "user_tb")
public class MUser {
		
	 @Id
	 @NotBlank
	 @Column(name = "user_id")
	 private Integer user_id;

	 @NotBlank
	 @Column(name = "name")
	 private String name;
	 
	 @NotBlank
	 @Column(name = "name_kana")
	 private String name_kana ;
	 
	 @NotBlank
	 @Email
	 @Column(name = "mail_address")
	 private String mail_address ;
	 
	 @NotBlank
	 @Pattern(regexp = "[a-zA-Z0-9]*")
	 @Column(name = "password")
	 private String password;
	 
}

