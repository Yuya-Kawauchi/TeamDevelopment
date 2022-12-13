package com.example.demo.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
	public class LeaningNewReportForm {
		
		@NotEmpty
		private Integer created_at;
		
		@NotEmpty
		private String start_time;
		
		@NotEmpty
		private String end_time;
		
		@NotNull
		private String course_id;
		
		@NotNull
		private String chapters_id;
		
		@NotNull
		private String text_id;
	
       
}