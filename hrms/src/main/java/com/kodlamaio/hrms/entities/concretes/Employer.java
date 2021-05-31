package com.kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper = true)

public class Employer extends User {


    @Column(name="company_name")
    private String companyName;

    @Column(name="website_name")
    private String websiteName;

    @Column(name="phone_number")
    private String phoneNumber;

}
