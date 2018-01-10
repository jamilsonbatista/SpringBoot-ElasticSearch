package elastic.dao.impl;

import elastic.dao.IBaseDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
public class BaseDao implements IBaseDao {

    @PersistenceContext
    private final EntityManager entityManager;

    public BaseDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
