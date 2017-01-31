package pcuk.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pcuk.controllers.postcode.business.AveragePriceByMonthYearPostCode;

@RestController
@CrossOrigin
public class AveragePriceController {

	@RequestMapping(method=RequestMethod.GET,value="/avgPrice")
	public List<AveragePriceByMonthYearPostCode> getAverageData(@RequestParam(name="postcode", defaultValue="LE11 5EX")String name){
		return null;		
	}
	
}
