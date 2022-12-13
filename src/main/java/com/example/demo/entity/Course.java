package com.example.demo.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity

@Data

@Table(name = "course")
public class Course {
	
	 @Id
	 @NotBlank
	 @Column(name = "course_id")
	 private String course_id;

	 @NotBlank
	 @Column(name = "chapters_id")
	 private String chapters_id;
	 
	 @NotBlank
	 @Column(name = "text_id")
	 private String text_id ;
	 

}
