package proffessor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import proffessor.model.entity.ExamEntity;
import proffessor.service.ExamService;
import proffessor.service.implementation.ExamServiceImplment;

@SpringBootApplication
public class ProffessorModuleApplication { 

	@Autowired
	ExamService examService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProffessorModuleApplication.class, args);
	
		
	    
	}
	
}
