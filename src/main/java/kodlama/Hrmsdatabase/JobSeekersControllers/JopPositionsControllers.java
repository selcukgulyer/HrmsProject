package kodlama.Hrmsdatabase.JobSeekersControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.Hrmsdatabase.business.abstracts.JobPositionService;
import kodlama.Hrmsdatabase.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/JopPositions")
public class JopPositionsControllers {
	private JobPositionService jobPositionService;
	
	@Autowired
	public JopPositionsControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@PostMapping("/JobPositionsAdd")
	public void JobPositionAdd(@RequestBody JobPositions jobPositions) {
	 this.jobPositionService.jobPositonAdd(jobPositions);
	}
	
	@GetMapping("/JobPositionsGetAll")
	public 	List<JobPositions> getAll(){
		return this.jobPositionService.getAll();
	}

	

}
