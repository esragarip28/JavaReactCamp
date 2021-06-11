package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.utilities.results.*;
import com.kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;
import com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobAdvertisementManager implements JobAdvertisementService {
   private JobAdvertisementDao jobAdvertisementDao;

   @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        if(!checkIfNullField(jobAdvertisement)){
            return new ErrorResult("Please fill in all fields.");
        }
        this.jobAdvertisementDao.save(jobAdvertisement);

        return new SuccessResult("Job advertisement has been added");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll());
    }

    @Override
    public boolean checkIfNullField(JobAdvertisement jobAdvertisement) {
        if (jobAdvertisement.getJobDescription()!=null&& jobAdvertisement.getCity().getId()!=0
                &&jobAdvertisement.getNumberOfPosition()!=0){
            return true;
        }
        return false;
    }

    @Override
    public DataResult<List<JobAdvertisementListDto>> findAllByOrderByCreatedAtDesc() {
        return new SuccessDataResult<List<JobAdvertisementListDto>>(this.jobAdvertisementDao.findAllByOrderCreatedAtDesc());
    }

    @Override
    public DataResult<List<JobAdvertisementListDto>> findByAllActive() {
        return new SuccessDataResult<List<JobAdvertisementListDto>>(this.jobAdvertisementDao.findAllByActive());
    }

    @Override
    public DataResult<List<JobAdvertisementListDto>> findAllByOrderCreatedAtAsc() {
        return new SuccessDataResult<List<JobAdvertisementListDto>>(this.jobAdvertisementDao.findAllByOrderCreatedAtAsc());
    }

    @Override
    public SuccessDataResult<List<JobAdvertisementListDto>> findAllByEmployer_CompanyName(String companyName) {
      return new SuccessDataResult<List<JobAdvertisementListDto>>(this.jobAdvertisementDao.findByActiveTrueEmployer_CompanyName(companyName));
    }

    @Override
    public Result closeAdvertisement(int id) {
       this.jobAdvertisementDao.closeAdvertisement(id);
        return new SuccessResult("Successfully updated");
    }

}
