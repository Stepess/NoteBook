package ua.training.model.dao.impl;

import ua.training.model.dao.AddressDAO;
import ua.training.model.entity.Address;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCDAOAddress implements AddressDAO {

    private Connection connection;

    public JDBCDAOAddress(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(Address obj) {
        return false;
    }

    @Override
    public Address findById(int id) {
        return null;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public boolean update(Address obj) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
