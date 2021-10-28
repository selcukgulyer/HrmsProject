package kodlama.Hrmsdatabase.JobSeekersControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.Hrmsdatabase.business.abstracts.JobSeekersService;
import kodlama.Hrmsdatabase.entities.concretes.JobSeekers;



@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersControllers {
	private JobSeekersService jobSeekersService;
	

	@Autowired
	public JobSeekersControllers(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
		
		
	}
	
	@PostMapping("/JobSeekersadd")
	public void SignIn(@RequestBody JobSeekers jobSeekers)
	{	
	this.jobSeekersService.SignIn(jobSeekers);
	}
	

	@GetMapping("/getAll")
	public List<JobSeekers> getAll() {
		return this.jobSeekersService.getAll();
	}
	
	
}
