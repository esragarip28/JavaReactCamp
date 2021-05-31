package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {
    @Override
    public boolean isEmailValid(String email) {
        return true;
    }

    @Override
    public boolean isEmailUnique(String Email) {
        return true;
    }
}
