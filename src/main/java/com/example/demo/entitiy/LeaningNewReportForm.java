package com.example.demo.entitiy;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
	public class LeaningNewReportForm {
		
		@NotEmpty
		private Integer createdAt;
		
		@NotEmpty
		@DateTimeFormat(pattern = "yyyy-MM-dd")   // 入力時の期待フォーマット
        @JsonFormat(pattern = "yyyy/MM/dd")   // 出力時の期待フォーマット
		private String startTime;
		
		@NotEmpty
		@DateTimeFormat(pattern = "yyyy-MM-dd")   // 入力時の期待フォーマット
        @JsonFormat(pattern = "yyyy/MM/dd")   // 出力時の期待フォーマット
		private String endTime;
		private String courseId;
		private String chaptersId;
		private String textId;
}