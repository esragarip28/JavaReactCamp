package com.kodlamaio.hrms.api.Controller;

import com.kodlamaio.hrms.business.abstracts.ResumeService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/resume")
@RestController
public class ResumeController {
    private ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/getAll")
    DataResult<List<Resume>> getAll(){
        return this.resumeService.getAll();

    }
    @GetMapping("/getResumeById")
    public DataResult<Resume> getResumeById(int id){
        return this.resumeService.getResumeById(id);
    }

    @PostMapping("/add")
    public Result add( Resume resume){
        return this.resumeService.add(resume);
    }



}
