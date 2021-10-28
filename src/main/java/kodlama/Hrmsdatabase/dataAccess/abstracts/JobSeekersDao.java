package kodlama.Hrmsdatabase.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.Hrmsdatabase.entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer>{
	List<JobSeekers> getByIdentityNumber(String identityNumber);
	
}
