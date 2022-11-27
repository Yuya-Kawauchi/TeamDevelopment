package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Data
@Table(name = "TEXTS")
public class Texts {
	 @Id
	 @Column(name = "text_id")
	 private String text_id;

	 @Column(name = "text_name")
	 private String text_name;
	 
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @Column(name = "chapters_id")
	 private String chapters_id;
