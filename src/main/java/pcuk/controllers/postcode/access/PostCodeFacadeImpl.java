package pcuk.controllers.postcode.access;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pcuk.controllers.postcode.business.OutCodeBo;
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

	@Override
	public OutCodeBo getOutCode(String name) {		
		return postCodeDao.getOutCode(name);
	}

	@Override
	public List<PostCodeBo> getPostCodesWithinOutCode(String outCode) {		
		return postCodeDao.getPostCodesWithinOutCode(outCode);
	}

}
