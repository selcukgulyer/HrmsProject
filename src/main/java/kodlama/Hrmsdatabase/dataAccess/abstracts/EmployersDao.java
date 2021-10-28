package kodlama.Hrmsdatabase.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.Hrmsdatabase.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers,Integer>{

}
