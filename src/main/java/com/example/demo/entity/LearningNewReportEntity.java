package com.example.demo.entity;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "report")
public class LearningNewReportEntity{
 
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
// @NotNull
 @Column(name = "rema")
 private Integer rema;
 
// @NotNull
 @Column(name = "user_id")
 private Integer user_id;

// @NotNull (message = "日付を入力してください。")
 @Column(name = "created_at")
// @DateTimeFormat(pattern = "YYYY-MM-DD")
 private Date created_at;
 
// @NotNull (message = "時間を入力してください。")
 @DateTimeFormat(pattern = "HH:mm:ss")
 @Column(name = "start_time")
 private LocalTime start_time ;
 
// @NotNull (message = "時間を入力してください。")
 @DateTimeFormat(pattern = "HH:mm:ss")
 @Column(name = "end_time")
 private LocalTime end_time ;
 
// @NotNull
 @Column(name = "course_id")
 private String course_id;
 
 @Column(name = "remark")
 private String remark;
 }
