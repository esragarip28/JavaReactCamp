package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.EmailVerificationService;
import com.kodlamaio.hrms.business.abstracts.JobSeekerService;
import com.kodlamaio.hrms.business.abstracts.MernisVerificationService;
import com.kodlamaio.hrms.core.adapters.MernisServiceAdapter;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private MernisVerificationService mernisVerificationService;
    private EmailVerificationService emailVerificationService;

    public JobSeekerManager(JobSeekerDao jobSeekerDao) {

        this.jobSeekerDao = jobSeekerDao;
        this.mernisVerificationService=new MernisServiceAdapter();
        this.emailVerificationService=new EmailVerificationManager();
    }

    @Override
    public Result add(JobSeeker jobSeeker, String rePassword) {

        if (!isFillIn(jobSeeker) && jobSeeker.getPassword().equals(rePassword)) {
            return new ErrorResult("Please fill in all field");
        } else if (!this.mernisVerificationService.isMernisVerified(jobSeeker.getNationalityId(), jobSeeker.getName()
                , jobSeeker.getSurname(), jobSeeker.getBirthYear())) {
            return new ErrorResult("Please enter correct information for mernis validation");
        } else if (!this.emailVerificationService.isEmailValid(jobSeeker.getEmail())) {
            return new ErrorResult("Please enter a valid email");

        } else if (!this.emailVerificationService.isEmailUnique(jobSeeker.getEmail())) {
            return new ErrorResult("the email has been recorded please enter a unique email");
        }
        else if(!this.mernisVerificationService.isNationalityIdUnique(jobSeeker.getNationalityId())){
            return new ErrorResult("the email has been recorded please enter a unique email");
        }
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("job seeker has been added successfully");
    }

    @Override
    public Result delete(JobSeeker jobseeker) {
        return null;
    }

    @Override
    public List<JobSeeker> getAll() {
        return this.jobSeekerDao.findAll();
    }

    @Override
    public boolean isFillIn(JobSeeker jobSeeker) {
        if(jobSeeker.getName().isBlank()|| jobSeeker.getSurname().isBlank()||
                 jobSeeker.getEmail().isBlank()||String.valueOf(jobSeeker.getBirthYear()).isBlank()||
                jobSeeker.getNationalityId().isBlank()|| jobSeeker.getPassword().isBlank()){
            return false;

        }
        return true;
    }

   }

