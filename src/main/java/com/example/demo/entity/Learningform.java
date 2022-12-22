package com.example.demo.entity;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
	public class Learningform implements Serializable{
	 
		

	@NotNull
	 @Column(name = "rema")
	 private Integer rema;
	 
	@NotNull
	 @Column(name = "user_id")
	 private Integer user_id;

	@NotNull (message = "日付を入力してください。")
//	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 @Column(name = "created_at")
	 private Date created_at;
	 
	@NotNull (message = "時間を入力してください。")
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "start_time")
	 private String start_time ;
	 
	@NotNull (message = "時間を入力してください。")
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "end_time")
	 private String end_time ;
	 
	@NotNull
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @Column(name = "remark")
	 private String remark;
	 
	 @DateTimeFormat(pattern = "HH:mm:ss")
	 @Column(name = "total_time")
	 private LocalTime total_time;
	
}
