package ru.dms.gringrant.service.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dms.gringrant.model.Project;
import ru.dms.gringrant.service.ProjectService;
import ru.dms.gringrant.repository.ProjectRepository;
import com.google.common.collect.Lists;
import java.util.List;

@Service("projectService")
@Repository
@Transactional
public class ProjectServiceImpl  implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Transactional(readOnly=true)
    public List<Project> findAll() {
        return  Lists.newArrayList(projectRepository.findAll());
    }

    @Transactional(readOnly=true)
    public Project findById(Long id) {
        return projectRepository.findById(id).get();
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
