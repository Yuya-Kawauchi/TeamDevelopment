package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity

@Data
@Table(name = "TEXTS")
public class Texts {
	
	 @Id
	 @NotNull
	 @Column(name = "text_id")
	 private String text_id;

	 @NotNull
	 @Column(name = "text_name")
	 private String text_name;
	 
	 @NotNull
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @NotNull
	 @Column(name = "chapters_id")
	 private String chapters_id;
}
