package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity

@Data
@Table(name = "texts")
public class Texts {
	 @Id
	 @NotBlank
	 @Column(name = "text_id")
	 private String text_id;

	 @NotBlank
	 @Column(name = "text_name")
	 private String text_name;
	 
	 @NotBlank
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @NotBlank
	 @Column(name = "chapters_id")
	 private String chapters_id;
	 
	 

}
