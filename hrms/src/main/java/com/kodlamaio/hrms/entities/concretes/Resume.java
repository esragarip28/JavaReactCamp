package com.kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resumes")
public class Resume {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="github_account")
    private String githubAccount;

    @Column(name="linked_in_account")
    private String linkedInAccount;

    @Column(name="cover_letter")
    private String coverLetter;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name="user_id")
    private JobSeeker jobSeeker;

    @OneToMany(mappedBy = "resume")
    List<Education> educationList;

    @OneToMany(mappedBy = "resume")
    List<JobExperience> jobExperienceList ;

    @OneToMany(mappedBy = "resume")
    List<LanguageSkill> languageSkillList;

    @OneToMany(mappedBy = "resume")
    List<TechnologySkill> technologySkillList;







}
