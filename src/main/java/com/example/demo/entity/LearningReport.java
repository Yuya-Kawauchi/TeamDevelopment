package com.example.demo.entity;
	import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

	@Entity
	
	@Data
	@Table(name = "report")
	public class LearningReport{
	 
		
	 @Id
	 @NotBlank
	 @Column(name = "rema")
	 private Integer rema;
	 
	 @NotBlank
	 @Column(name = "user_id")
	 private Integer user_id;

	 @NotBlank
	 @Column(name = "created_at")
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date created_at;
	 
	 @NotBlank
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "start_time")
	 private String start_time ;
	 
	 @NotBlank
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "end_time")
	 private String end_time ;
	 
	 @NotBlank
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @Column(name = "remark")
	 private String remark;
	
}
