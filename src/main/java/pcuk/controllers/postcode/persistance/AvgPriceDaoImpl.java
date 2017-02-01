package pcuk.controllers.postcode.persistance;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pcuk.controllers.postcode.business.AveragePriceByMonthYearPostCode;

@Repository
public class AvgPriceDaoImpl implements AvgPriceDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<AveragePriceByMonthYearPostCode> getAverageData(String postCode) {
		List<AveragePriceByMonthYearPostCode> response = new ArrayList<AveragePriceByMonthYearPostCode>();
		String query ="from AveragePriceByMonthYearPostCode as av where av.postCode = ?1";
		System.out.println();
		response = entityManager.createQuery(query).setParameter(1, postCode).getResultList();
		

				
		//getResultList().forEach(a->response.add((AveragePriceByMonthYearPostCode) a));


		response.forEach(a-> a.print());
		//	return  response;*/

		//	response = entityManager.createNativeQuery("SELECT * FROM pcdb.avg_price where post_code  = '" +postCode +"' ;").getResultList();
	
		return response;
	}

}
