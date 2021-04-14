package proffessor.service;

import java.util.List;

//import java.util.List;

import proffessor.model.entity.ExamEntity;
import proffessor.model.entity.QuestionsEntity;


public interface ExamService {
     
	
	public void saveExam(ExamEntity exam);

	public void saveQuestions(QuestionsEntity questions);
	
	public List<String> getExams();
	
	public void setExamStatus(QuestionsEntity questions);
	
	public List<String> getExamsByStatus(Boolean status);
	
	public String getExamTypeByExamName(String examName);
	
	public String getMarksByExamName(String examName);
}
