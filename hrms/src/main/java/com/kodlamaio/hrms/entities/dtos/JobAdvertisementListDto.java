package com.kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementListDto {

    @NotNull
    private String companyName;
    @NotNull
    private String jobTitle;
    @NotNull
    private int numberOfPosition;
    @NotNull
    private LocalDate deadlineAt;
    @NotNull
    private LocalDate createdAt ;








}