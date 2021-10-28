package kodlama.Hrmsdatabase.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.Hrmsdatabase.business.abstracts.JobPositionService;
import kodlama.Hrmsdatabase.dataAccess.abstracts.JobPositonDao;
import kodlama.Hrmsdatabase.entities.concretes.JobPositions;

@Service
public class JobPositionManager implements JobPositionService {
	private JobPositonDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositonDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public void jobPositonAdd(JobPositions jobPositions) {
		if(this.jobPositionDao.getByJobPositionName(jobPositions.getJobPositionName()).size()>0)
		{
			System.out.println("bu pozisyon adı zaten var");
		}
		else {
			this.jobPositionDao.save(jobPositions);
		}
	}

	@Override
	public List<JobPositions> getAll() {
	
		return this.jobPositionDao.findAll();
		
	}

}
