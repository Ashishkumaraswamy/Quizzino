package com.Ashish.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ashish.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}