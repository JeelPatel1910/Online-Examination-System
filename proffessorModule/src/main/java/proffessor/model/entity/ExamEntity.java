package proffessor.model.entity;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exams")
public class ExamEntity {

	@Override
	public String toString() {
		return "ExamEntity [ExamName=" + ExamName + ", ExamDate=" + ExamDate + ", Marks=" + Marks + "]";
	}

	@Id
	@GeneratedValue
	@Column(length = 100)
	private int id;

	@Column(nullable = false, length = 100)
	private String ExamName;

	@Column(nullable = false, length = 100)
	private String ExamDate;

	@Column(nullable = false, length = 50)
	private String Marks;

	@Column(nullable = false, length = 50)
	private String Time;

	@Column(nullable = false, length = 100)
	private String ExamType;

	

	public String getExamName() {
		return ExamName;
	}

	public void setExamName(String examName) {
		ExamName = examName;
	}

	public String getExamDate() {
		return ExamDate;
	}

	public void setExamDate(String examDate) {
		ExamDate = examDate;
	}

	public String getMarks() {
		return Marks;
	}

	public void setMarks(String marks) {
		Marks = marks;
	}
	
	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getExamType() {
		return ExamType;
	}

	public void setExamType(String examType) {
		ExamType = examType;
	}
}
