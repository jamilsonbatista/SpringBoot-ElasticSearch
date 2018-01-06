package elastic.dao;

import elastic.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Repository
public interface ITownDao extends JpaRepository<Town, String> {
}
