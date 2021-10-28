package kodlama.Hrmsdatabase.business.abstracts;

import java.util.List;

import kodlama.Hrmsdatabase.entities.concretes.User;

public interface UserService {
	List<User> liste();
	
	List<User> getByEmail(String email);
	


	
}
