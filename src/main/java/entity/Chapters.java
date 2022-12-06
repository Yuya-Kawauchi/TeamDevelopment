package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity

@Data
@Table(name = "CHAPTERS")
public class Chapters {

	 @Id
	 @NotNull
	 @Column(name = "chapters_id")
	 private String chapters_id;

	 @NotNull
	 @Column(name = "chapter")
	 private String chapters;
	 
	 @NotNull
	 @Column(name = "course_id")
	 private String course_id;
	 
}