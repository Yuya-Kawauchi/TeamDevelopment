package com.example.demo.entitiy;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

public class textsEntity {
	
@Data
@Table(name = "text")
public class LeaningNewReportEntity {
   /**
	   * ID
	   */
	@Column(name = "text_id")
	  private Integer text_id;
	
	@Column(name = "text_name")
	  private Integer text_name;
	 
	@Column(name = "course_id")
      private Integer course_id;
  
	@Column(name = "chapters_id")
	  private Integer chapters_id;
		
	}
}