package kodlama.Hrmsdatabase.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.Hrmsdatabase.entities.concretes.User;


public interface UserDao  extends JpaRepository<User, Integer>{
	List<User> getByEmail(String email);

}

