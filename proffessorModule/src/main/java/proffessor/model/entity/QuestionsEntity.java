package proffessor.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")

public class QuestionsEntity {

	@Id
	@GeneratedValue
	@Column(length = 100)
	private int id;

	@Column(nullable = false, length = 300)
	private String ExamName;

	@Column(nullable = false, length = 500)
	private String Question;

	@Column(nullable = false, length = 100)
	private String Option1;

	@Column(nullable = false, length = 100)
	private String Option2;

	@Column(nullable = false, length = 100)
	private String Option3;

	@Column(nullable = false, length = 100)
	private String Option4;

	@Column(nullable = false, length = 100)
	private String Answer;

	public String getExamName() {
		return ExamName;
	}

	public void setExamName(String examName) {
		ExamName = examName;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}
}
