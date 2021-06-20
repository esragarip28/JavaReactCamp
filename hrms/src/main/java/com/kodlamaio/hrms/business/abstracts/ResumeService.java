package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Resume;

import java.util.List;

public interface ResumeService {
    DataResult<List<Resume>> getAll();
    Result add(Resume resume);
    DataResult<Resume> getResumeById(int id);




}
