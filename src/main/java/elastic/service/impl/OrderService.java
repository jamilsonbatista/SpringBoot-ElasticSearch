package elastic.service.impl;

import elastic.dao.IOrderDao;
import elastic.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
public class OrderService implements IOrderService {

    @Autowired
    private IOrderDao orderDao;
}
