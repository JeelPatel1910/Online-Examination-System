package proffessor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

	
	@RequestMapping("stud")
    public String home()
    {
   	 return"StudentDashboard";
    }
	
	@GetMapping(value="/ExamList")
	public String examList()
	{
		return "ExamList";
	}
}
