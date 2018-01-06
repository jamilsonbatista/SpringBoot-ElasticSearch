package elastic.service.impl;

import elastic.dao.IOrderDetailDao;
import elastic.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Service
@Transactional
public class OrderDetailService implements IOrderDetailService {

    @Autowired
    private IOrderDetailDao orderDetailDao;
}
