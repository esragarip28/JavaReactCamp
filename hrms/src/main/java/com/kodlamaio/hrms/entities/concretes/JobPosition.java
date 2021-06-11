package com.kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //we said that how to increase our id value
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;

    @OneToMany(mappedBy = "jobPosition")
    @JsonIgnore
    private List<JobAdvertisement> jobAdvertisements;


}
