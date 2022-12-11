package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.LearningReport;
import entity.Chapters;
import entity.Course;
import entity.Texts;

@Repository
public interface LearningReportEditRepository
    extends JpaRepository <LearningReport, Integer> {
}


