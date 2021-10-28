package kodlama.Hrmsdatabase.entities.concretes;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="job_advertisement")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="employe_id")
	private int employeId;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_wage")
	private String minWage;
	
	@Column(name="max_wage")
	private String maxWage;
	
	@Column(name="number_of_positions")
	private String numberOfPositions;
	
	@Column(name="durum")
	private boolean durum;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPositions jobPositions;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	

	
	public JobAdvertisement() {
		
	}
	
	public JobAdvertisement(int id, String jobDescription, JobPositions jobPositions,City city,
		 String minWage, String maxWage, String numberOfPositions,
			Date applicationDeadline,int empoyleId,boolean durum) {
		super();
		this.id = id;
		this.jobDescription = jobDescription;
		this.jobPositions = jobPositions;
		this.city=city;
		this.minWage = minWage;
		this.maxWage = maxWage;
		this.numberOfPositions = numberOfPositions;
		this.applicationDeadline = applicationDeadline;
		this.employeId=empoyleId;
		this.durum=durum;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public JobPositions getJobPositions() {
		return jobPositions;
	}

	public void setJobPositions(JobPositions jobPositions) {
		this.jobPositions = jobPositions;
	}



	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getMinWage() {
		return minWage;
	}

	public void setMinWage(String minWage) {
		this.minWage = minWage;
	}

	public String getMaxWage() {
		return maxWage;
	}

	public void setMaxWage(String maxWage) {
		this.maxWage = maxWage;
	}

	public String getNumberOfPositions() {
		return numberOfPositions;
	}

	public void setNumberOfPositions(String numberOfPositions) {
		this.numberOfPositions = numberOfPositions;
	}

	public Date getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(Date applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public boolean isDurum() {
		return durum;
	}

	public void setDurum(boolean durum) {
		this.durum = durum;
	}







}
