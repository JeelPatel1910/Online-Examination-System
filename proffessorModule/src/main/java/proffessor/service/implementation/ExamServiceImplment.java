package proffessor.service.implementation;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import proffessor.model.entity.ExamEntity;
import proffessor.model.entity.QuestionsEntity;
import proffessor.model.repositories.ExamRepository;
import proffessor.model.repositories.QuestionsRepository;
import proffessor.service.ExamService;

@Service
public class ExamServiceImplment implements ExamService {
	
	@Autowired
	ExamRepository examRepository;
	
	@Autowired
	QuestionsRepository questionsRepository;

	@Override
	public void saveExam(ExamEntity exam) {
		
		examRepository.save(exam);
	}

	
	@Override
	public void saveQuestions(QuestionsEntity questions) {
		questionsRepository.save(questions);
		
	}


	@Override
	public List<String> getExams() {
		List<String> exams = new ArrayList<>();
		exams = examRepository.getExams();
		return exams;
	}


	@Override
	public void setExamStatus(QuestionsEntity questions) {
		String examName = questions.getExamName(); 
		examRepository.setExamStatus(examName);
		
	}


	@Override
	public List<String> getExamsByStatus(Boolean status) {
		List<String> exams = new ArrayList<>();
		
		if(status=true) {
		exams = examRepository.getExamsByStatus();
		}
		return exams;
		
	}


	@Override
	public String getExamTypeByExamName(String examName) {
	    String examType = examRepository.getExamTypeByExamName(examName);
		return examType;
	}


	@Override
	public String getMarksByExamName(String examName) {
		String marks = examRepository.getMarksByExamName(examName);
		return marks;
	}



	

	
}
