package elastic.service.impl;

import elastic.dao.ITownDao;
import elastic.service.ITownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Service
@Transactional
public class TownService implements ITownService {

    @Autowired
    private ITownDao townDao;
}
