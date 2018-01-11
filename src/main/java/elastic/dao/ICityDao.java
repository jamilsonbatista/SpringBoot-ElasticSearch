package elastic.dao;

import elastic.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Repository
public interface ICityDao extends JpaRepository<City, String> {
}
