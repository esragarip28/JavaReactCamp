package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.CityService;
import com.kodlamaio.hrms.business.abstracts.ResumeService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import com.kodlamaio.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeManager implements ResumeService {
    private ResumeDao resumeDao;

    @Autowired
    public ResumeManager(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;
    }

    @Override
    public DataResult<List<Resume>> getAll() {
        if (this.resumeDao.findAll()==null){
            return new ErrorDataResult<>("there is no resume to see");
        }
        return new SuccessDataResult<>(this.resumeDao.findAll());
    }

    @Override
    public Result add(Resume resume) {
        return null;
    }

    @Override
    public DataResult<Resume> getResumeById(int id) {
        if (this.resumeDao.findById(id)==null){
            return new ErrorDataResult<>("there is no resume has the id");
        }
        return new SuccessDataResult<>(this.resumeDao.findById(id).get());
    }
}
