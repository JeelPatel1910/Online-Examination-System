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
	public List<ExamEntity> getExams() {
		List<ExamEntity> exams = new ArrayList<>();
		exams = examRepository.findAll();
		return exams;
	}


	

	
}
