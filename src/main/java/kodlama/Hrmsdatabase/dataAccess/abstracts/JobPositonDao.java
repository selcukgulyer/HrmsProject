package kodlama.Hrmsdatabase.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.Hrmsdatabase.entities.concretes.JobPositions;

public interface JobPositonDao extends JpaRepository<JobPositions, Integer> {
	List<JobPositions> getByJobPositionName(String jobPositionName);

}
