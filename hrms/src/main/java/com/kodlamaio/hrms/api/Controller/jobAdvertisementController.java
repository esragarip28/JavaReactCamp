package com.kodlamaio.hrms.api.Controller;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;
import com.kodlamaio.hrms.entities.dtos.JobAdvertisementListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdverts")
public class jobAdvertisementController {

    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public jobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }
    @GetMapping("/findAllByOrderCreatedAt")
    public DataResult<List<JobAdvertisementListDto>> findAllByOrderByCreatedAtDesc(){
        return this.jobAdvertisementService.findAllByOrderByCreatedAtDesc();
    }
    @GetMapping("/findByAllActive")
    public DataResult<List<JobAdvertisementListDto>> findByAllActive(){
        return this.jobAdvertisementService.findByAllActive();
    }

    @GetMapping("/findAllByOrderCreatedAtAsc")
    public DataResult<List<JobAdvertisementListDto>> findAllByOrderCreatedAtAsc(){
        return this.jobAdvertisementService.findAllByOrderCreatedAtAsc();
    }

    @GetMapping("/findByActiveTrueEmployerCompanyName")
    public DataResult<List<JobAdvertisementListDto>> findByActiveTrueEmployer_CompanyName(String companyName){
        return this.jobAdvertisementService.findAllByEmployer_CompanyName(companyName);
    }

    @PostMapping("/closeAdvertisement")
    public Result closeAdvertisement(int id){
        return this.jobAdvertisementService.closeAdvertisement(id);
    }


}




