package learningListController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.LearningEditForm;
import entity.LearningReport;
import learningListService.LearningListService;


@Controller
public class LearningListController {
	@Autowired
	private LearningListService learningListService;
	
	  @GetMapping("/learningReportList")
	  public String showLearningList(Model model) {
	    List<LearningReport> learningreport = learningListService.findAll();
	    model.addAttribute("learningreport", learningreport);
	    return "learningReportList";
	  }
	  
	  @PostMapping(path = "edit", params = "edit")
	  public String postLearningList(@RequestParam Integer id, @ModelAttribute LearningReport learningReport) {
		  LearningEditForm learningEditForm = learningListService.selectById(id);
		  return "learningReportEdit";
	  }
	  @PostMapping(path = "learningReportList", params = "delete")
	  public String deleteLearningReport(@RequestParam Integer id) {
		  learningListService.delete(id);
		  return "redirect:/learningReportList";
	  }
	  
	  

}
