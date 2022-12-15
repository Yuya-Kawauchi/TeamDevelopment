package com.example.demo.entity;
	import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

	@Entity
	
	@Data
	@Table(name = "report")
	public class LearningReport{
	 
		
	 @Id
	 @NotNull
	 @Column(name = "rema")
	 private Integer rema;
	 
	 @NotNull
	 @Column(name = "user_id")
	 private Integer user_id;

	 @NotNull
	 @Column(name = "created_at")
	 @DateTimeFormat(pattern = "YYYY-MM-DD")
	 private Date created_at;
	 
	 @NotNull
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "start_time")
	 private Date start_time ;
	 
	 @NotNull
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "end_time")
	 private Date end_time ;
	 
	 @NotNull
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @Column(name = "remark")
	 private String remark;
	 
	 
	
}
