package ru.dms.gringrant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dms.gringrant.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
