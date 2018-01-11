package elastic.service;

import elastic.entity.Address;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
public interface IAddressService  {

    public Address findByUserId(String userId);
}
