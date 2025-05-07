package com.kaunghtet.SpringBootRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaunghtet.SpringBootRest.model.JobPost;
import com.kaunghtet.SpringBootRest.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	@GetMapping("jobPost")
	@ResponseBody
	public List<JobPost> getAllJobs() {
		return service.getallJobs();
	}
}
