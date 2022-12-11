package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LearningReport;

@Repository
public interface LearningReportEditRepository
    extends JpaRepository <LearningReport, Integer> {
}


