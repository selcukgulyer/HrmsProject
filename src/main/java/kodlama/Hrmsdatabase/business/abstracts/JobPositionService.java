package kodlama.Hrmsdatabase.business.abstracts;

import java.util.List;

import kodlama.Hrmsdatabase.entities.concretes.JobPositions;

public interface JobPositionService {
	public void jobPositonAdd(JobPositions jobPositions);
	List<JobPositions> getAll();
}
