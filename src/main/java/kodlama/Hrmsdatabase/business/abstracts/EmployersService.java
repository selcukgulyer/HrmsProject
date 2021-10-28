package kodlama.Hrmsdatabase.business.abstracts;

import java.util.List;

import kodlama.Hrmsdatabase.entities.concretes.Employers;

public interface EmployersService {
	public void EmployersSignIn(Employers employers);
	List<Employers> getAll();

}
