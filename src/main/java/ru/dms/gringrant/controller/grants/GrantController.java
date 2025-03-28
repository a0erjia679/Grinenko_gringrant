package ru.dms.gringrant.controller.grants;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.dms.gringrant.model.Project;
import ru.dms.gringrant.service.ProjectService;


@RestController
@RequestMapping("/")
@AllArgsConstructor
public class GrantController {
//    @Value("${spring.application.name}")
//    String appName;
    private final ProjectService projectService;
    @GetMapping("/grants")
    public ModelAndView messages() {
        ModelAndView mav = new ModelAndView("home");
        Project project = new Project();
        project.setTitle("Проект4");
        project.setCategory("dfsagsgfd");
        project.setPurpose("Цель проекта4");
        project.setPurposeGroups("Целевая группа 4");
        project.setSoutialSignificant("gfsdhfgjghkhjl4");
        project.setTasks("dgdfhfgjgh4");
        projectService.save(project);

        project = new Project();
        project.setTitle("Проект5");
        project.setCategory("dfsagsgfd5");
        project.setPurpose("Цель проекта5");
        project.setPurposeGroups("Целевая группа 5");
        project.setSoutialSignificant("gfsdhfgjghkhjl");
        project.setTasks("dgdfhfgjgh");
        projectService.save(project);
        var projects = projectService.findAll();

        mav.addObject("appName", "ГринГрант");
        mav.addObject("projects", projects);
        mav.addObject("project", projects.get(0));
        return mav;
    }
}
