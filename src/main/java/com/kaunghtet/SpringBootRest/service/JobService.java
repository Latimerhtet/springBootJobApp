package com.kaunghtet.SpringBootRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaunghtet.SpringBootRest.model.JobPost;
import com.kaunghtet.SpringBootRest.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	JobRepo repo;
	
	public List<JobPost> getallJobs() {
		return repo.getAllJobs();
	}
	
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
}
