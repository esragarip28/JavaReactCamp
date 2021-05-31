package com.kodlamaio.hrms.business.abstracts;

public interface EmailVerificationService {
    public boolean isEmailValid(String email);
    public boolean isEmailUnique(String Email);
}
