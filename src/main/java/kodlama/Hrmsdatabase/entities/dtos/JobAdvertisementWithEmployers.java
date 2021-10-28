package kodlama.Hrmsdatabase.entities.dtos;

import java.util.Date;

public class JobAdvertisementWithEmployers {
	
	private int id;
	private String companyName;
	private String jobPositionName;
	private String jobDescription;
	private Date applicationDeadline;
	
	public JobAdvertisementWithEmployers()  {
		
	}
	
	public JobAdvertisementWithEmployers(int id, String companyName, String jobPositionName, String jobDescription,
			Date applicationDeadline) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobPositionName = jobPositionName;
		this.jobDescription = jobDescription;
		this.applicationDeadline = applicationDeadline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobPositionName() {
		return jobPositionName;
	}

	public void setJobPositionName(String jobPositionName) {
		this.jobPositionName = jobPositionName;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Date getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(Date applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

}
