package proffessor.model.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proffessor.model.entity.ExamEntity;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Integer>
{
	
	 @Query("SELECT  e.ExamName from ExamEntity e")
	  public List<String> getExams();
  
	 @Query("SELECT e.ExamName from ExamEntity e WHERE e.Status=true") 
	 public List<String> getExamsByStatus();
	 
	 @Modifying
	 @Query("update ExamEntity e set e.Status=true WHERE e.ExamName = :examName")
	 @Transactional
	 public void setExamStatus(@Param("examName")String examName);
	 
	 @Query("SELECT e.ExamType from ExamEntity e WHERE e.ExamName = :examName ")
	 public String getExamTypeByExamName(@Param("examName")String examName);

	 @Query("SELECT e.Marks from ExamEntity e WHERE e.ExamName = :examName")
	 public String getMarksByExamName(@Param("examName")String examName);
}
