package com.kodlamaio.hrms.dataAccess.abstracts;

import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;
import com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {


            @Query("Select new com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto"
                    +"(e.companyName,p.jobTitle, j.numberOfPosition, j.createdAt, j.deadlineAt) " +
                    "From JobAdvertisement j Inner Join j.employer e Inner Join  j.jobPosition p where j.isActive=true  Order By j.createdAt Desc")
        List<JobAdvertisementListDto> findAllByOrderCreatedAtDesc();

            @Query("Select new com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto"
                    +"(e.companyName,p.jobTitle, j.numberOfPosition, j.createdAt, j.deadlineAt) " +
                    "From JobAdvertisement j Inner Join j.employer e Inner Join  j.jobPosition p where j.isActive=true  Order By j.createdAt Asc")
        List<JobAdvertisementListDto> findAllByOrderCreatedAtAsc();


        @Query("Select new com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto"
                +"(e.companyName,p.jobTitle, j.numberOfPosition, j.createdAt, j.deadlineAt) " +
                "From JobAdvertisement j Inner Join j.employer e Inner Join  j.jobPosition p where j.isActive=true")
        List<JobAdvertisementListDto>findAllByActive();

            @Query("Select new com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto"
                    +"(e.companyName,p.jobTitle, j.numberOfPosition, j.createdAt, j.deadlineAt) "+
                    "From JobAdvertisement j Inner Join j.employer e Inner Join  j.jobPosition p where j.isActive=true" +
                    " and e.companyName=:companyName")
        List<JobAdvertisementListDto>findByActiveTrueEmployer_CompanyName(String companyName);

        @Transactional
        @Modifying
        @Query("Update JobAdvertisement  j Set j.isActive=false Where j.id=:id")
        void closeAdvertisement(int id);



}
