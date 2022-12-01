package Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Repository.LearningReportEditRepository;
import entity.LearningEditForm;
import entity.LearningReport;

@Service
@Transactional
public class LearningReportEditService {
	
	@Autowired
	LearningReportEditRepository learningReportEditRepository;
	
	public  Optional<LearningReport> selectById(Integer rema) {
		return learningReportEditRepository.findById(rema);
	}
	

	public void update(LearningReport learningReport) {
		
		LearningEditForm form = new LearningEditForm();
		
		form.setRema(learningReport.getRema());
		form.setUser_id(learningReport.getUser_id());
		form.setCreated_at(learningReport.getCreated_at());
		form.setStart_time(learningReport.getStart_time());
		form.setEnd_time(learningReport.getEnd_time());
		form.setCourse_id(learningReport.getCourse_id());
		form.setRemark(learningReport.getRemark());
		
		learningReportEditRepository.save(form);
	}
}
