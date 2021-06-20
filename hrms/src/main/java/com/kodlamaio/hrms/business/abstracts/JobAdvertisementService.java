package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;
import com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto;


import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> getAll();
    boolean checkIfNullField(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisementListDto>> findAllByOrderByCreatedAtDesc();
    DataResult<List<JobAdvertisementListDto>> findByAllActive();
    DataResult<List<JobAdvertisementListDto>> findAllByOrderCreatedAtAsc();
    DataResult<List<JobAdvertisementListDto>> findAllByEmployer_CompanyName(String companyName);
    Result closeAdvertisement(int id);




















}
