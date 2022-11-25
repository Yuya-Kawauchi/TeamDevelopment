package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.LearningListRepository;
import entity.LearningReport;

@Service
public class LearningListService {
	 @Autowired
	  private LearningListRepository learningListRepository;

	  public List<LearningReport> findAll() {
	    return learningListRepository.findAll();
	  }
	  
	  public void selectById(interger id) {
		  learningListRepository.findById(id);
	  }
	  
	  public void delete(Integer id){
		 LearningReport learningReport = findById(id);
		 learningListRepository.delete(learningReport);
	  }
	  
}
