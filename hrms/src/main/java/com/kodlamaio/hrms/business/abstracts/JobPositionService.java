package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();

}
