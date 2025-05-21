package com.kaunghtet.SpringBootRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kaunghtet.SpringBootRest.model.JobPost;
import com.kaunghtet.SpringBootRest.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	@GetMapping("jobPosts")
	@ResponseBody
	public List<JobPost> getAllJobs() {
		return service.getallJobs();
	}

	@GetMapping("jobPost/{postId}")
	@ResponseBody
	public JobPost getJob(@PathVariable int postId) {
		return service.getJob(postId);
	}



	@PostMapping("jobPost")
	public JobPost addJob(@RequestBody JobPost jobPost){
		service.addJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}

	@PutMapping("jobPost")
	public JobPost editJob(@RequestBody JobPost jobPost) {
		service.editJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}

	@DeleteMapping("jobPost/{postId}")
	public void deleteJob(@PathVariable int postId) {
		System.out.println("In Delete" +  postId);
		service.deleteJob(postId);
		System.out.println(service.getallJobs());
	}

	@GetMapping("load")
	public String load() {
		service.load();
		return "success";
	}

}
