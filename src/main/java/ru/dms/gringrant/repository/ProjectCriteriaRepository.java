package ru.dms.gringrant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dms.gringrant.model.ProjectCriteria;

public interface ProjectCriteriaRepository  extends JpaRepository<ProjectCriteria, Long> {
}
