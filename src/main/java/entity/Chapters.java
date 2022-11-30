package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Data
@Table(name = "CHAPTERS")
public class Chapters {

	 @Id
	 @Column(name = "chapters_id")
	 private String chapters_id;

	 @Column(name = "chapter")
	 private String chapter;
	 
	 @Column(name = "course_id")
	 private String course_id;
	 
}
