package ru.dms.gringrant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "expert_validation")
@Getter
@Setter
public class ExpertValidation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 1000)
    private String title;

    @Column(name = "project_title", length = 1000)
    private String projectTitle;

    @Column(name = "sotial_significance_title", length = 1000)
    private String sotialSignificanceTitle;

    @Column(name = "sotial_significance_comment1", length = 1000)
    private String sotialSignificanceCommentOne;

    @Column(name = "sotial_significance_comment2", length = 1000)
    private String sotialSignificanceCommentTwo;

    @Column(name = "logical_coherence_title", length = 1000)
    private String logicalCoherenceTitle;

    @Column(name = "logical_coherence_comment1", length = 1000)
    private String logicalCoherenceCommentOne;

    @Column(name = "logical_coherence_comment2", length = 1000)
    private String logicalCoherenceCommentTwo;

    @Column(name = "project_uniqness_title", length = 1000)
    private String projectUniqnessTitle;

    @Column(name = "project_uniqness_comment1", length = 1000)
    private String projectUniqnessCommentOne;

    @Column(name = "project_uniqness_comment2", length = 1000)
    private String projectUniqnessCommentTwo;



    @Column(name = "planned_implementation_costs_title", length = 1000)
    private String plannedImplementationCostsTitle;

    @Column(name = "planned_implementation_costs_comment1", length = 1000)
    private String plannedImplementationCostsCommentOne;

    @Column(name = "planned_implementation_costs_comment2", length = 1000)
    private String plannedImplementationCostsCommentTwo;

    @Column(name = "realistic_budget_title", length = 1000)
    private String realisticBudgetTitle;

    @Column(name = "realistic_budget_comment1", length = 1000)
    private String realisticBudgetCommentOne;

    @Column(name = "realistic_budget_comment2", length = 1000)
    private String realisticBudgetCommentTwo;

    @Column(name = "project_implementation_scale_title", length = 1000)
    private String projectImplementationScaleTitle;

    @Column(name = "project_implementation_scale_comment1", length = 1000)
    private String projectImplementationScaleCommentOne;

    @Column(name = "project_implementation_scale_comment2", length = 1000)
    private String projectImplementationScaleCommentTwo;

    @Column(name = "own_contribution_title", length = 1000)
    private String ownContributionTitle;

    @Column(name = "own_contribution_comment1", length = 1000)
    private String ownContributionCommentOne;

    @Column(name = "own_contribution_comment2", length = 1000)
    private String ownContributionCommentTwo;

    @Column(name = "organization_experience_title", length = 1000)
    private String organizationExperienceTitle;

    @Column(name = "organization_experience_comment1", length = 1000)
    private String organizationExperienceCommentOne;

    @Column(name = "organization_experience_comment2", length = 1000)
    private String organizationExperienceCommentTwo;

    @Column(name = "matching_experience_title", length = 1000)
    private String matchingExperienceTitle;

    @Column(name = "matching_experience_comment1", length = 1000)
    private String matchingExperienceCommentOne;

    @Column(name = "matching_experience_comment2", length = 1000)
    private String matchingExperienceCommentTwo;

    @Column(name = "information_opennes_title", length = 1000)
    private String informationOpennesTitle;

    @Column(name = "information_opennes_comment1", length = 1000)
    private String informationOpennesCommentOne;

    @Column(name = "information_opennes_comment2", length = 1000)
    private String informationOpennesCommentTwo;

    @Column
    @Temporal(value= TemporalType.DATE)
    private LocalDate markDate;
}
