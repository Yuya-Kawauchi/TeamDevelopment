package entity;

	import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

	@Entity
	
	@Data
	@Table(name = "employee")
	public class LearningReport{
	 
		
	 @Id
	 @Column(name = "rema")
	 private Integer rema;
	 
	 @Column(name = "user_id")
	 private Integer user_id;

	 @Column(name = "created_at")
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date created_at;
	 
	 @Column(name = "start_time")
	 @DateTimeFormat(pattern = "HH/mm")
	 private String start_time ;
	 
	 @Column(name = "end_time")
	 @DateTimeFormat(pattern = "HH/mm")
	 private String end_time ;
	 
	 @Column(name = "course_id")
	 private String course_id;
	 
	 @Column(name = "remark")
	 private String remark;
	
}
