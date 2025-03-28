package ru.dms.gringrant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "projects")
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 1000)
    private String title;

    @Column(name = "category", length = 1000, nullable = true)
    private String category;

    @Column(name = "purpose", length = 1000, nullable = true)
    private String purpose;

    @Column(name = "soutial_significante", length = 1000, nullable = true)
    private String soutialSignificant;

    @Column(name = "purpose_groups", length = 1000, nullable = true)
    private String purposeGroups;

    @Column(name = "tasks", length = 1000, nullable = true)
    private String tasks;
}
