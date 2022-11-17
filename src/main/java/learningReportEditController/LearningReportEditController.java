package learningReportEditController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import entity.LearningReport;
import learningEditService.LearningEditService;

@Controller
public class LearningReportEditController {

	@Autowired
	private LearningEditService learningEditService;
	
	  @GetMapping("/learningReportEdit")
	  public String  showLearningEdit(Model model ,LearningReport learningReport) {
	    List<LearningReport> learningreport = learningEditService.selectById(id);
	    model.addAttribute(learningReport);
	    return "learningReportEdit";
	  }
	  
	  @PostMapping("/Toppage")
	  public String postLearningEdit(@ModelAttribute @Validated LearningReport learningReport, BindingResult result,Model model) {
			
			if (result.hasErrors()) {
				
				return "learningReportEdit";
			}
			learningEditService.update(learningReport);
			return "redirect:/Toppage";
	  }
			
			
	  @PostMapping(path = "/learningReportEdit", params = "back")
	  public String back() {
		  return "redirect:/learningReportList";
	  }
	
}
