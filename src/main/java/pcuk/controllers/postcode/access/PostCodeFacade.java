package pcuk.controllers.postcode.access;

import java.util.List;

import pcuk.controllers.postcode.business.OutCodeBo;
import pcuk.controllers.postcode.business.PostCodeBo;

public interface PostCodeFacade {

	
	public PostCodeBo getPostCode(String name);
	public List<PostCodeBo> getPostCodesWithinOutCode(String outCode);
	public OutCodeBo getOutCode(String name);

}
