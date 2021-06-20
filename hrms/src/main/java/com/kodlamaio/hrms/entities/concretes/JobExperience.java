package com.kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "job_experiences")


public class JobExperience{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="job_title")
    private String jobTitle;


    @Column(name="starting_date")
    private int startingDate;

    @Column(name="finish_date")
    private int finishDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="resume_id")
    private Resume resume;

}