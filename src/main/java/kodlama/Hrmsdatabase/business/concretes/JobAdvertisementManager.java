package kodlama.Hrmsdatabase.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.Hrmsdatabase.business.abstracts.JobAdvertisementService;
import kodlama.Hrmsdatabase.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.Hrmsdatabase.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao jobAdvertisementDao; 
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	@Override
	public void jobAdvertisementAdd(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		
	}

}
