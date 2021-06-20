package com.kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "educations")


public class Education{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="university_name")
    private String universityName;

    @Column(name="department_name")
    private String departmentName;

    @Column(name="faculty_name")
    private String facultyName;

    @Column(name="starting_date")
    private int startingDate;

    @Column(name="finish_date")
    private int finishDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="resume_id")
    private Resume resume;


}