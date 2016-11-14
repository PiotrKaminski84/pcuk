package pcuk.controllers.postcode.persistance;

import java.util.List;

import pcuk.controllers.postcode.business.OutCodeBo;
import pcuk.controllers.postcode.business.PostCodeBo;

public interface PostCodeDao {

	public PostCodeBo getPostCode(String name);
	public OutCodeBo getOutCode(String name);
	public List<PostCodeBo> getPostCodesWithinOutCode(String outCode);
}
