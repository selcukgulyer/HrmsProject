package kodlama.Hrmsdatabase.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.Hrmsdatabase.business.abstracts.EmployersService;
import kodlama.Hrmsdatabase.dataAccess.abstracts.EmployersDao;
import kodlama.Hrmsdatabase.dataAccess.abstracts.UserDao;
import kodlama.Hrmsdatabase.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	private UserDao userDao;
	@Autowired
	public EmployersManager(EmployersDao employersDao,UserDao userDao) {
		super();
		this.employersDao = employersDao;
		this.userDao=userDao;
	}

	@Override
	public void EmployersSignIn(Employers employers) {
		if(this.userDao.getByEmail(employers.getUser().getEmail()).size()>0)
		{
			System.out.println("Bu email zaten kayıtlı");
		}
		else {
			//epostaya doğrulama gidip kayıt olunacak!
			this.employersDao.save(employers);
		}
	}

	@Override
	public List<Employers> getAll() {
		
		return this.employersDao.findAll();
	}

}
