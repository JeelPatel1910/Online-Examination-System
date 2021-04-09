package proffessor.service;




import java.util.List;

//import java.util.List;

import proffessor.model.entity.ExamEntity;
import proffessor.model.entity.QuestionsEntity;


public interface ExamService {
     
	
	public void saveExam(ExamEntity exam);

	public void saveQuestions(QuestionsEntity questions);
	
	public List<ExamEntity> getExams();
}
