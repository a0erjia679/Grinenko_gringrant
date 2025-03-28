package ru.dms.gringrant.service;

import ru.dms.gringrant.model.ExpertValidation;

import java.util.List;

public interface ExpertValidationService {
    public List<ExpertValidation> findAll();
    public ExpertValidation findById(Long id);
    public ExpertValidation save(ExpertValidation expertValidation);
    public void delete(Long id);
}
