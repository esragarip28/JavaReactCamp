package com.kodlamaio.hrms.api.Controller;

import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
    public class EmployerController {
    private EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
       return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer,String rePassword){
        return this.employerService.add(employer,rePassword);

    }

}
