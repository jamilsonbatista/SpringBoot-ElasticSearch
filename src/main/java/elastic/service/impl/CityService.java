package elastic.service.impl;

import elastic.dao.ICityDao;
import elastic.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Transactional
@Service
public class CityService implements ICityService {

    @Autowired
    private ICityDao cityDao;
}
