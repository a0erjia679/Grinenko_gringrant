package ru.dms.gringrant.service.jpa;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dms.gringrant.model.ExpertValidation;
import ru.dms.gringrant.repository.ExpertValidationRepository;
import ru.dms.gringrant.service.ExpertValidationService;

import java.util.List;

@Service("expertValidationService")
@Repository
@Transactional
public class ExpertValidationServiceImpl implements ExpertValidationService {
    @Autowired
    private ExpertValidationRepository expertValidationRepository;

    @Transactional(readOnly=true)
    public List<ExpertValidation> findAll() {
        return  Lists.newArrayList(expertValidationRepository.findAll());
    }

    @Transactional(readOnly=true)
    public ExpertValidation findById(Long id) {
        return expertValidationRepository.findById(id).get();
    }

    public ExpertValidation save(ExpertValidation expertValidation) {
        return expertValidationRepository.save(expertValidation);
    }

    public void delete(Long id) {
        expertValidationRepository.deleteById(id);
    }
}
