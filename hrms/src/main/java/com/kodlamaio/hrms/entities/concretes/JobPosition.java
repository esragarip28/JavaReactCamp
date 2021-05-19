package com.kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_position")
public class JobPosition {
    @Id
    @GeneratedValue //we said that how to increase our id value
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;

    public JobPosition(){}

    public JobPosition(int id, String jobTitle) {
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
