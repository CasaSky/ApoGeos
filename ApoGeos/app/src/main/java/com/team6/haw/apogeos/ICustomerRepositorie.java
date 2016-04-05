package com.team6.haw.apogeos;

import com.team6.haw.apogeos.Entitäten.Customer;

/**
 * Created by talal on 05.04.16.
 */
public interface ICustomerRepositorie {


    public void save(Customer customer);
    public void delete(Customer customer);
    public void update(Customer customer);
}
