package ru.dms.gringrant.service;

import ru.dms.gringrant.model.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> findAll();
    public Project findById(Long id);
    public Project save(Project holiday);
    public void delete(Long id);
}
