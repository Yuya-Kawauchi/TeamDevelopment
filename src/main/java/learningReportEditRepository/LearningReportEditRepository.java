package learningReportEditRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.LearningReport;

@Repository
public interface LearningReportEditRepository
    extends JpaRepository <LearningReport, Long> {
}


