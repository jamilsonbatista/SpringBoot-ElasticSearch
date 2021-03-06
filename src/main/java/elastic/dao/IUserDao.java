package elastic.dao;

import elastic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mehmet Ali Sahinogullari on 03-Jan-18.
 */
@Repository
public interface IUserDao extends JpaRepository<User, String> {
}
