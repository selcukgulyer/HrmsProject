package kodlama.Hrmsdatabase.JobSeekersControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.Hrmsdatabase.business.abstracts.EmployersService;
import kodlama.Hrmsdatabase.entities.concretes.Employers;

@RestController
@RequestMapping("/api/Employers")
public class EmployersControllers {
	private EmployersService employerService;
	
	@Autowired
	public EmployersControllers(EmployersService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@PostMapping("/employersAdd")
	public void EmployerSignIn(@RequestBody Employers employers) {
		this.employerService.EmployersSignIn(employers);
	}
	
	@GetMapping("/EmployersGetAll")
	public List<Employers> getAll(){
		return this.employerService.getAll();
	}
	

}
