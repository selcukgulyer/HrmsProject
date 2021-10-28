package kodlama.Hrmsdatabase.JobSeekersControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.Hrmsdatabase.business.abstracts.JobAdvertisementService;
import kodlama.Hrmsdatabase.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisementControllers")
public class jobAdvertisementControllers {
		private JobAdvertisementService jobAdvertisementService;
		@Autowired
		public jobAdvertisementControllers(JobAdvertisementService jobAdvertisementService) {
			super();
			this.jobAdvertisementService = jobAdvertisementService;
		}
		
		@PostMapping("/add")
		public void jobAdvertisementAdd(@RequestBody JobAdvertisement jobAdvertisement)
		{
			 this.jobAdvertisementService.jobAdvertisementAdd(jobAdvertisement);
		}
}
