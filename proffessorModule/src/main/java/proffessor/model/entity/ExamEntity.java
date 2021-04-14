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

	@Column(nullable = false, length = 100)
	private String ExamType;
	
	@Column( length = 50)
	private String StartTime="00";
	
	@Column( length = 50 )
	private String EndTime="00";

	@Column(length=20)
	private boolean Status=false;

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

	public String getExamType() {
		return ExamType;
	}

	public void setExamType(String examType) {
		ExamType = examType;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
	
}
