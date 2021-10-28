package kodlama.Hrmsdatabase.business.abstracts;


import java.util.List;


import kodlama.Hrmsdatabase.entities.concretes.JobSeekers;

public interface JobSeekersService {
	public void SignIn(JobSeekers jobSeekers);
	public  List<JobSeekers> getAll();
	
}
