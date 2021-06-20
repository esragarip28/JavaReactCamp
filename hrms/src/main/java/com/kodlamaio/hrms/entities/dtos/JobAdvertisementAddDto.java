package com.kodlamaio.hrms.entities.dtos;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementAddDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @NotNull
    @NotBlank
    private String jobDescription;

    @NotNull
    private int numberOfPosition;

    @NotNull
    private LocalDate createdAt;

    @NotNull
    private LocalDate deadlineAt;

    @NotNull
    private int cityId;

    @NotNull
    private int employerId;

    @NotNull
    private int jobPositionId;






}