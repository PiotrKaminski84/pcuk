package pcuk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pcuk.controllers.postcode.business.AveragePriceByMonthYearPostCode;
import pcuk.controllers.postcode.persistance.AvgPriceDao;

@RestController
@CrossOrigin
public class AveragePriceController {
	
	@Autowired
	AvgPriceDao dao;

	@RequestMapping(method=RequestMethod.GET,value="/avgPrice")
	public List<AveragePriceByMonthYearPostCode> getAverageData(@RequestParam(name="postcode", defaultValue="AL1 1AJ")String name){
		return dao.getAverageData(name);		
	}
	
}
