package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    Result add(JobSeeker jobSeeker,String rePassword);
    Result delete(JobSeeker jobseeker);
    List<JobSeeker> getAll();
    boolean isFillIn(JobSeeker jobSeeker);


}
