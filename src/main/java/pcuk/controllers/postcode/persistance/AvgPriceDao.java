package pcuk.controllers.postcode.persistance;

import java.util.List;

import pcuk.controllers.postcode.business.AveragePriceByMonthYearPostCode;

public interface AvgPriceDao {

	List<AveragePriceByMonthYearPostCode> getAverageData(String postCode);
}
