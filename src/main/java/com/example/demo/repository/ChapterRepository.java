package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Chapters;


@Repository
public interface ChapterRepository
    extends JpaRepository <Chapters, String> {
}



