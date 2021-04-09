package proffessor.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proffessor.model.entity.QuestionsEntity;

@Repository
public interface QuestionsRepository extends JpaRepository<QuestionsEntity,Integer>{

}
