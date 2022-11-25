package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.LearningReport;

@Repository
public interface LearningListRepository
    extends JpaRepository <LearningReport, Long> {
}