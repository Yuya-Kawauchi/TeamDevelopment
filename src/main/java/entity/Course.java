package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity

@Data
@Table(name = "COURSE")
public class Course {
	
	 @Id
	 @NotNull
	 @Column(name = "course_id")
	 private String course_id;

	 @NotNull
	 @Column(name = "chapters_id")
	 private String chapters_id;
	 
	 @NotNull
	 @Column(name = "text_id")
	 private String text_id ;
	 
}