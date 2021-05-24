package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.JobPositionService;
import coderkubra.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job-titles")
public class JobControllers {

	private JobPositionService jobPositionService;

	@Autowired
	public JobControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall") 
	public List<JobPosition> getAll(){  
		return this.jobPositionService.getAll();
	}
	
}
