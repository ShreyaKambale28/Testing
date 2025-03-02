package com.example.assignment2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FAQRepository extends JpaRepository<FAQ, Long> {

    // Ensure the method name is correct to search by question
    List<FAQ> findByQuestionContainingIgnoreCase(String question);
}
