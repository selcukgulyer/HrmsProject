package kodlama.Hrmsdatabase.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@Table(name="job_positions")
public class JobPositions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_position_id")
	private int id;
	
	@Column(name="job_position_name")
	private String jobPositionName;
	
	
	@OneToMany(mappedBy = "jobPositions")
	private List<JobAdvertisement> jobAdvertisements;

	
	
	public JobPositions() {
		
	}
	public JobPositions(int id, String jobPositionName,List<JobAdvertisement> jobAdvertisements) {
		super();
		this.id = id;
		this.jobPositionName = jobPositionName;
		this.jobAdvertisements=jobAdvertisements;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobPositionName() {
		return jobPositionName;
	}
	public void setJobPositionName(String jobPositionName) {
		this.jobPositionName = jobPositionName;
	}
	public List<JobAdvertisement> getJobAdvertisements() {
		return jobAdvertisements;
	}
	public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}


}
