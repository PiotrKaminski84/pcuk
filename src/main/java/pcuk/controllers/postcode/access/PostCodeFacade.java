package pcuk.controllers.postcode.access;

import pcuk.controllers.postcode.business.PostCodeBo;

public interface PostCodeFacade {

	
	public PostCodeBo getPostCode(String name);
}
