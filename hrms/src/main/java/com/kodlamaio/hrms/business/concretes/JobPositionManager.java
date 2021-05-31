package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.JobPositionService;
import com.kodlamaio.hrms.core.utilities.results.*;
import com.kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import com.kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }


    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>
                (this.jobPositionDao.findAll(),"job position listed");

    }

    @Override
    public Result add(JobPosition jobPosition) {
        if(isJobTitleUnique(jobPosition.getJobTitle())){
            this.jobPositionDao.save(jobPosition);
            return new SuccessResult("job position added");
        }
        return new ErrorResult("Please enter a unique job title");


    }

    @Override
    public Result delete(JobPosition jobPosition) {
        return null;
    }

    @Override
    public boolean isJobTitleUnique(String jobTitle) {
        return true;
    }

}
