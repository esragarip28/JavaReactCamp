package com.kodlamaio.hrms.business.abstracts;

public interface MernisVerificationService {

    boolean isMernisVerified(String nationalityId,String name,String surname,int birthYear);
    boolean isNationalityIdUnique(String nationalityId);

}
