package com.kodlamaio.hrms.dataAccess.abstracts;

import com.kodlamaio.hrms.entities.concretes.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDao extends JpaRepository<Resume,Integer> {

}
