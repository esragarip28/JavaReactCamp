package com.kodlamaio.hrms.core.adapters;

import com.kodlamaio.hrms.business.abstracts.MernisVerificationService;
import com.kodlamaio.hrms.mernisReference.JTMKPSPublicSoap;


public class MernisServiceAdapter implements MernisVerificationService {
    @Override

    public boolean isMernisVerified(String nationalityId,String name,String surname, int birthYear) {

       JTMKPSPublicSoap client=new JTMKPSPublicSoap();
        try{
            return client.TCKimlikNoDogrula(Long.valueOf(nationalityId),name,surname,birthYear);

        }catch (Exception ex){

        }
        return false;
    }

    @Override
    public boolean isNationalityIdUnique(String nationalityId) {
        return true;
    }


}



