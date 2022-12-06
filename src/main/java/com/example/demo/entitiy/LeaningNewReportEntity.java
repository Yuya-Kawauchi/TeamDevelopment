package com.example.demo.entitiy;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name = "user")
public class LeaningNewReportEntity {
	   /**
	   * ID
	   */
	  @Column(name = "created_at")
	  private Integer createdAt;
	  /**
	   * 開始時間
	   */
	  @Column(name = "start_time")
	  private String startTime;
	  /**
	   *終了時間
	   */
	  @Column(name = "end_time")
	  private String endTime;
	  /**
	   * 学習登録
	   */
	  @Column(name = "course_id")
	  private String courseId;
	  
	  @Column(name = "chapters_id")
	  private String chaptersId;
	  
	  @Column(name = "text_id")
	  private String textId;
	  
	 
	}