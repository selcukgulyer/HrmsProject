package kodlama.Hrmsdatabase.JobSeekersControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.Hrmsdatabase.business.abstracts.UserService;
import kodlama.Hrmsdatabase.entities.concretes.User;

@RestController
@RequestMapping("/api/User")
public class UserControllers {
	private UserService userService;
	
	@Autowired
	public UserControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAllUser")
	public List<User> Liste() {
		return this.userService.liste();
	}
	
	@GetMapping("/getByEmail")
	public List<User> getByEmail(@RequestParam String email){
		return this.userService.getByEmail(email);
	}
}
