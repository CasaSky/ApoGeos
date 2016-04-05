package com.team6.haw.apogeos.DAOS;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.team6.haw.apogeos.CustomTypes.SeriennummerTyp;
import com.team6.haw.apogeos.DBAccessHandlerService;
import com.team6.haw.apogeos.Entitäten.Customer;
import com.team6.haw.apogeos.ICustomerRepositorie;
import com.team6.haw.apogeos.IDBAccessHandler;

import java.sql.SQLException;

/**
 * Created by talal on 04.04.16.
 */
public class CustomerDao implements ICustomerRepositorie{

    private Dao<Customer, SeriennummerTyp> customerDao;
    private IDBAccessHandler dbAccessHandler;

    public CustomerDao(ConnectionSource connectionSource) {

        try {
            customerDao = DaoManager.createDao(connectionSource, Customer.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        dbAccessHandler = new DBAccessHandlerService();

    }


    @Override
    public void save(Customer customer) {
        try {
            customerDao.create(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Customer customer) {
        try {
            customerDao.delete(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Customer customer) {
        try {
            customerDao.createOrUpdate(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
