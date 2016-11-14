package pcuk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pcuk.controllers.postcode.access.PostCodeFacade;
import pcuk.controllers.postcode.business.PostCodeBo;

@RestController
@CrossOrigin
public class PostCodeCtrl {
	
	@Autowired
	PostCodeFacade postCodeFacade;

	@RequestMapping(method=RequestMethod.GET,value="/postcode")
	public PostCodeBo getPostCode(@RequestParam(name="postcode", defaultValue="LE11 5EX")String name){		
		return postCodeFacade.getPostCode(name);
		
	}
	
}
