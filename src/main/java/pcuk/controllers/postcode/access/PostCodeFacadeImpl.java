package pcuk.controllers.postcode.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pcuk.controllers.postcode.business.PostCodeBo;
import pcuk.controllers.postcode.persistance.PostCodeDao;

@Repository
public class PostCodeFacadeImpl implements PostCodeFacade {

	@Autowired
	PostCodeDao postCodeDao;
	
	@Override
	public PostCodeBo getPostCode(String name) {		
		return postCodeDao.getPostCode(name);
	}

}
