package ru.dms.gringrant.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.dms.gringrant.model.ExpertValidation;
import ru.dms.gringrant.service.ExpertValidationService;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.util.Comparator;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ExpertValidationController {
    private final ExpertValidationService expertValidationService;

    @GetMapping("/validation/list")
    public ModelAndView messages() {
        ModelAndView mav = new ModelAndView("validations");
       var validations = expertValidationService.findAll()
               .stream()
               .sorted(Comparator.comparing(ExpertValidation::getMarkDate).reversed())
               .limit(3)
               .toList();
        mav.addObject("validations", validations);
        return mav;
    }

    @GetMapping("/validation/add")
    public ModelAndView addValidation() {
        ModelAndView mav = new ModelAndView("addvalidation");
        var validations = expertValidationService.findAll()
                .stream()
                .sorted(Comparator.comparing(ExpertValidation::getMarkDate))
                .limit(3)
                .toList();
        mav.addObject("validations", validations);
        mav.addObject("validation1", validations.get(0));
        return mav;
    }

    @GetMapping("/validation/edit/{id}")
    public ModelAndView editValidation(@PathVariable(value="id", required=false) long id) {
        ModelAndView mav = new ModelAndView("addvalidation");
        ExpertValidation validation = expertValidationService.findById(id);
        mav.addObject("validation1", validation);
        return mav;
    }

    @PostMapping("/validation/add")
    public String greetingSubmit(@ModelAttribute ExpertValidation expertValidation) {
        expertValidation.setSotialSignificanceTitle("Актуальность и социальная значимость проекта");
        expertValidation.setLogicalCoherenceTitle("Логическая связность и реализуемость проекта, соответствие мероприятий проекта его целям, задачам и ожидаемым результатам");
        expertValidation.setProjectUniqnessTitle("Инновационность, уникальность проекта");
        expertValidation.setPlannedImplementationCostsTitle("Соотношение планируемых расходов на реализацию проекта и его ожидаемых результатов, адекватность, измеримость и достижимость таких результатов");
        expertValidation.setRealisticBudgetTitle("Реалистичность бюджета проекта и обоснованность планируемых расходов на реализацию проекта");
        expertValidation.setProjectImplementationScaleTitle("Масштаб реализации проекта");
        expertValidation.setOwnContributionTitle("Собственный вклад организации и дополнительные ресурсы, привлекаемые на реализацию проекта, перспективы его дальнейшего развития");
        expertValidation.setOrganizationExperienceTitle("Опыт организации по успешной реализации программ, проектов по соответствующему направлению деятельности");
        expertValidation.setMatchingExperienceTitle("Соответствие опыта и компетенции команды проекта планируемой деятельности");
        expertValidation.setInformationOpennesTitle("Информационная открытость организации");
        expertValidation.setMarkDate(LocalDate.now());

        expertValidationService.save(expertValidation);
        return "validations";
    }

}
