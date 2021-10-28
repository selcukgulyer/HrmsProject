package kodlama.Hrmsdatabase.dataAccess.abstracts;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.Hrmsdatabase.entities.concretes.JobAdvertisement;
import kodlama.Hrmsdatabase.entities.dtos.JobAdvertisementWithEmployers;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	/*@Query("Select new kodlama.Hrmsdatabase.entities.dtos.JobAdvertisementWithEmployers(p.id) From Employers c Inner Join c.jobAdvertisement p ")
	List<JobAdvertisementWithEmployers> getJobAdvertisementWithEmployers(); */
}
/*
 * asdasd
  	@Query("Select new kodlamaio.nortwind.entities.dtos.ProductWithCategoryDtos"
			+ "(p.id,p.productName,c.categoryName) "
			+ "From Category c Inner Join c.products p")
	List<ProductWithCategoryDtos> getProductWithCategoryDetails();
 */
