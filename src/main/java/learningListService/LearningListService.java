package learningListService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.LearningReport;
import learningListRepository.LearningListRepository;

@Service
public class LearningListService {
	 @Autowired
	  private LearningListRepository learningListRepository;
	  /**
	   * ユーザー情報 全検索
	   * @return 検索結果
	   */
	  public List<LearningReport> findAll() {
	    return LearningListRepository.findAll();
	  }
	  
	  public void delete(Integer id){
		 LearningReport learningReport = findById(id);
		 learningListRepository.delete(learningReport);
	  }
	  
}
