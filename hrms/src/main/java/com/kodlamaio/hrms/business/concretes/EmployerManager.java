package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.EmailVerificationService;
import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilities.results.*;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private EmailVerificationService emailVerificationService;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
        this.emailVerificationService=new EmailVerificationManager();
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(this.employerDao.findAll());
    }

    @Override
    public Result add(Employer employer,String rePassword) {
        if(isFillIn(employer)){
            if(this.emailVerificationService.isEmailValid(employer.getEmail())){

                if (this.emailVerificationService.isEmailUnique(employer.getEmail())){

                    if(employer.getPassword().equals(rePassword)){
                        this.employerDao.save(employer);
                        return new SuccessResult("employer has been registered");

                    }
                    else return new ErrorResult("Please enter same password");

                }
                else return new ErrorResult("email has been aldready used");
            }
            else new ErrorResult("Please enter a valid email");


        }
        else return new ErrorResult("Please fill in all area");


        this.employerDao.save(employer);
        return new SuccessResult("Employer has been added ");
    }

    @Override
    public Result delete(Employer employer) {
        return null;
    }

    @Override
    public boolean isFillIn(Employer employer) {
        if(employer.getCompanyName().isBlank()||employer.getWebsiteName().isBlank()
                ||employer.getPhoneNumber().isBlank()||employer.getEmail().isBlank()||employer.getPassword().isBlank())
        {
            return false;
        }
        return true;
    }
}
