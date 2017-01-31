package pcuk.controllers.postcode.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pcuk.controllers.postcode.business.AveragePriceByMonthYearPostCode;
import pcuk.controllers.postcode.business.OutCodeBo;

@Repository
public class AvgPriceDaoImpl implements AvgPriceDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<AveragePriceByMonthYearPostCode> getAverageData(String postCode) {
		//return  entityManager.createQuery("from AveragePriceByMonthYearPostCode where postCode like '" + postCode + "'").getResultList();
		return entityManager.createNativeQuery("SELECT * FROM pcdb.avg_price where post_code  = '" +postCode +"' ;").getResultList();
	}

}
