package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
