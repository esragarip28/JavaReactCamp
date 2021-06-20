package com.kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name ="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = true)
public class JobSeeker extends User{


    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="nationalityId")
    private String nationalityId;

    @Column(name="birthYear")
    private int birthYear;

    @OneToOne(mappedBy = "jobSeeker")
    private Resume resume;


}