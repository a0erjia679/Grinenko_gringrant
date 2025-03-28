package ru.dms.gringrant.service.jpa;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dms.gringrant.model.ProjectCriteria;
import ru.dms.gringrant.repository.ProjectCriteriaRepository;
import ru.dms.gringrant.service.ProjectCriteriaService;

import java.util.List;

@Service("projectCriteriaService")
@Repository
@Transactional
public class ProjectCriteriaServiceImpl implements ProjectCriteriaService {
    @Autowired
    private ProjectCriteriaRepository projectCriteriaRepository;

    @Transactional(readOnly=true)
    public List<ProjectCriteria> findAll() {
        return  Lists.newArrayList(projectCriteriaRepository.findAll());
    }

    @Transactional(readOnly=true)
    public ProjectCriteria findById(Long id) {
        return projectCriteriaRepository.findById(id).get();
    }

    public ProjectCriteria save(ProjectCriteria projectCriteria) {
        return projectCriteriaRepository.save(projectCriteria);
    }

    public void delete(Long id) {
        projectCriteriaRepository.deleteById(id);
    }
}
