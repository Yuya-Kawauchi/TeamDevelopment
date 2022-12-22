package com.example.demo.entity;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
	public class Learningform implements Serializable{
	 
		

//	@NotNull

	 private Integer rema;
	 
//	@NotNull

	 private Integer user_id;

	@NotNull (message = "日付を入力してください。")
	 @DateTimeFormat(pattern = "yyyy-MM-dd")

	 private Date created_at;
	 
//	@NotNull (message = "時間を入力してください。")
	 @DateTimeFormat(pattern = "HH:mm:ss")

	 private String start_time ;
	 
//	@NotNull (message = "時間を入力してください。")
	 @DateTimeFormat(pattern = "HH:mm:ss")

	 private String end_time ;
	 
//	@NotNull

	 private String course_id;
	 

	 private String remark;
	 
	 @DateTimeFormat(pattern = "HH:mm:ss")

	 private LocalTime total_time;
	
}
