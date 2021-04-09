package proffessor.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proffessor.model.entity.ExamEntity;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Integer>
{
	
	//@Query("SELECT  e.ExamName from ExamEntity e")
	//public List<String> getExams();

	 @Query("SELECT  e from ExamEntity e")
	  public List<ExamEntity> getExams();
	
}
