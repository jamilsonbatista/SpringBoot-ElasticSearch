package elastic.service.impl;

import elastic.dao.ICountryDao;
import elastic.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
public class CountryService implements ICountryService {

    @Autowired
    private ICountryDao countryDao;
}
