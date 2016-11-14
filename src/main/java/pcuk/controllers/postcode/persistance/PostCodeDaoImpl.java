package pcuk.controllers.postcode.persistance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pcuk.controllers.postcode.business.PostCodeBo;

@Repository
public class PostCodeDaoImpl implements PostCodeDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public PostCodeBo getPostCode(String name) {
		
		return  (PostCodeBo) entityManager.createQuery("from PostCodeBo pc where pc.postCode like '" + name + "'").getResultList().get(0);
	}

}
