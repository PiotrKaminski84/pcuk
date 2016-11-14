package pcuk.controllers.postcode.persistance;

import pcuk.controllers.postcode.business.PostCodeBo;

public interface PostCodeDao {

	public PostCodeBo getPostCode(String name);
}
