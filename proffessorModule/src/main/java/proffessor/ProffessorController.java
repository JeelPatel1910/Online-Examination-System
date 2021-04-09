package proffessor;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import proffessor.model.entity.ExamEntity;
import proffessor.model.entity.QuestionsEntity;
import proffessor.service.ExamService;

@Controller
@RequestMapping("/")
public class ProffessorController {
    
	@Autowired
	ExamService examService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@RequestMapping("Prof")
     public String home()
     {
    	 return"ProffessorDashboard";
     }
	
     @RequestMapping(value = "/redirect", method = RequestMethod.GET)
     public String redirect()
     {
    	 return"redirect:/CreateExam";
     }

     @RequestMapping(value="/CreateExam" ,method =  RequestMethod.GET )
     public String createExam()
     {
         return"CreateExam";

     }
     
     @PostMapping(value = "/redirect1")
     public String redirect1(@ModelAttribute("Exam")ExamEntity exam)
     {   
    	
    	 examService.saveExam(exam);
    	 return"redirect:/QuestionPaper";
     }
     
     @PostMapping(value = "/redirect2")
     public String redirect2(@ModelAttribute("QuestionPaper")QuestionsEntity questions)
     {   
    	 System.out.println(questions);
    	 examService.saveQuestions(questions);
    	 return"redirect:/QuestionPaper";
     }
     
     @GetMapping(value="/QuestionPaper")
     public String questionPaper()
     {
    	 return"QuestionPaper";
     }
     
     
}