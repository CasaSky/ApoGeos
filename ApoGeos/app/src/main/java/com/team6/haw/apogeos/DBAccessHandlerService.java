package com.team6.haw.apogeos;

import com.j256.ormlite.android.AndroidConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.team6.haw.apogeos.Entitäten.*;

import java.sql.SQLException;

/**
 * Created by talal on 04.04.16.
 */
public class DBAccessHandlerService implements IDBAccessHandler{

    ConnectionSource connectionSource;

    public DBAccessHandlerService () {
        connectionSource = new AndroidConnectionSource(MainActivity.database);
        try {
            createTables();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createTables() throws SQLException {
        TableUtils.createTable(connectionSource, Customer.class);
        TableUtils.createTable(connectionSource, Gebiet.class);
        TableUtils.createTable(connectionSource, Information.class);
        TableUtils.createTable(connectionSource, Nachricht.class);
        TableUtils.createTable(connectionSource, Position.class);
    }
}
