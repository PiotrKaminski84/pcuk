package pcuk.controllers.postcode.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pcuk.controllers.postcode.business.OutCodeBo;
import pcuk.controllers.postcode.business.PostCodeBo;

@Repository
public class PostCodeDaoImpl implements PostCodeDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public PostCodeBo getPostCode(String name) {
		
		return  (PostCodeBo) entityManager.createQuery("from PostCodeBo pc where pc.postCode like '" + name + "'").getResultList().get(0);
	}

	@Override
	public OutCodeBo getOutCode(String name) {		
		return  (OutCodeBo) entityManager.createQuery("from OutCodeBo pc where pc.outCode like '" + name + "'").getResultList().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PostCodeBo> getPostCodesWithinOutCode(String outCode) {
		return entityManager.createNativeQuery("SELECT * FROM pcdb.postcodelatlng where postcode  REGEXP '" +outCode +" .*';").getResultList();
				//createQuery("from PostCodeBo  regex '%'").getResultList();
	}


}
