package proffessor.controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
     
     @PostMapping(value = "/redirect2" ,params ="Add")
     public String add(@ModelAttribute("QuestionPaper")QuestionsEntity questions)
     {   
    	 examService.saveQuestions(questions);
    	 return"redirect:/QuestionPaper";
     }
     
     @PostMapping(value = "/redirect2" ,params ="Submit")
     public String submit(QuestionsEntity questions)
     {   
    	 examService.setExamStatus(questions);
    	 return"redirect:/Prof";
     }
     
     @GetMapping(value="/QuestionPaper")
     public ModelAndView questionPaper()
     {
    	 return new ModelAndView("QuestionPaper").addObject("examService", examService);
     }
     
     @GetMapping(value="/examList")
     public ModelAndView examList()
     {
    	 return new ModelAndView("ProffessorExamList").addObject("examService", examService);
     }
     
     @PostMapping(value = "/SetExam")
     public ModelAndView setExam(@ModelAttribute("SetExams")ExamEntity exams ,Model model)
     {
    	 
    	 return new ModelAndView("SetExam").addObject("examService", examService);
     } 
}