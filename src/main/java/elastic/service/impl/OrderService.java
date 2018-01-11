package elastic.service.impl;

import elastic.dao.IOrderDao;
import elastic.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Service
@Transactional
public class OrderService implements IOrderService {

    @Autowired
    private IOrderDao orderDao;
}
