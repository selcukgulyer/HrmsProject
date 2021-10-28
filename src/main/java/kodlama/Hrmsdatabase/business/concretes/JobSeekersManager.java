package kodlama.Hrmsdatabase.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.Hrmsdatabase.business.abstracts.JobSeekersService;
import kodlama.Hrmsdatabase.dataAccess.abstracts.JobSeekersDao;
import kodlama.Hrmsdatabase.dataAccess.abstracts.UserDao;
import kodlama.Hrmsdatabase.entities.concretes.JobSeekers;


@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao jobSeekersDao;
	private UserDao userDao;
	
	

	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao,UserDao userDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
		this.userDao=userDao;
	
		
	}
	
	@Override
	public void SignIn(JobSeekers jobSeekers) {
		
		if(this.userDao.getByEmail(jobSeekers.getUser().getEmail()).size()>0 || this.jobSeekersDao.getByIdentityNumber(jobSeekers.getIdentityNumber()).size()>0)
			{			
				System.out.println("Email veya Tc zaten kayıtlı");		
			}
		else {
			
			this.jobSeekersDao.save(jobSeekers);		
			
			}
		
	}

	@Override
	public List<JobSeekers> getAll() {
		
		return this.jobSeekersDao.findAll();
	}

	

}


	


	


