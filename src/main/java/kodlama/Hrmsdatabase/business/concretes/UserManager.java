package kodlama.Hrmsdatabase.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.Hrmsdatabase.business.abstracts.UserService;
import kodlama.Hrmsdatabase.dataAccess.abstracts.UserDao;
import kodlama.Hrmsdatabase.entities.concretes.User;



@Service
public class UserManager implements UserService{

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public List<User> liste() {
		
		return this.userDao.findAll();
	}
	@Override
	public List<User> getByEmail(String email) {
		
		return this.userDao.getByEmail(email);
	}




	





	

}
