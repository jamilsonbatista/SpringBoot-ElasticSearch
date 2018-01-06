package elastic.service.impl;

import elastic.dao.IAddressDao;
import elastic.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Transactional
@Service
public class AddressService implements IAddressService {

    @Autowired
    private IAddressDao addressDao;
}
