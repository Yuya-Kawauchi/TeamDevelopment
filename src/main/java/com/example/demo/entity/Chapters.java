package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity

@Data
@Table(name = "CHAPTERS")
public class Chapters {

	 @Id
	 @NotBlank
	 @Column(name = "chapters_id")
	 private String chapters_id;

	 @NotBlank
	 @Column(name = "chapter")
	 private String chapters;
	 
	 @NotBlank
	 
	 @Column(name = "course_id")
	 private String course_id;
	 
}