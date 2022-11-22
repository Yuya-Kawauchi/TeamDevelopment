package learningReportEditService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.LearningEditForm;
import entity.LearningReport;
import learningReportEditRepository.LearningReportEditRepository;

@Service
@Transactional
public class learningReportEditService {
	
	@Autowired
	LearningReportEditRepository learningReportEditRepository;
	
	public  List<learningReport> selectById(Integer id) {
		return repository.findById(id);
	}
	

	public void update(LearningReport learningReport) {
		
		// データベースに登録する値を保持するインスタンスの作成
		LearningEditForm form = new LearningEditForm();
		
		// 画面から受け取った値を設定する
		form.setId(learningReport.getId());
		form.setUserId(learningReport.getUserId());
		form.setDate(learningReport.getDate());
		form.setStartTime(learningReport.getStartTime());
		form.setEndTime(learningReport.getEndTime());
		form.setCourseId(learningReport.getCourseId());
		form.setremark(learningReport.getremark());
		
		// データベースを更新する
		learningReportEditRepository.save(form);
	}
}
