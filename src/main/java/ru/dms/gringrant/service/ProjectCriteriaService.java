package ru.dms.gringrant.service;

import ru.dms.gringrant.model.ProjectCriteria;

import java.util.List;

public interface ProjectCriteriaService {
    public List<ProjectCriteria> findAll();
    public ProjectCriteria findById(Long id);
    public ProjectCriteria save(ProjectCriteria holiday);
    public void delete(Long id);
}
