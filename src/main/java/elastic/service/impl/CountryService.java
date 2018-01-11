package elastic.service.impl;

import elastic.dao.ICountryDao;
import elastic.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Service
@Transactional
public class CountryService implements ICountryService {

    @Autowired
    private ICountryDao countryDao;
}
