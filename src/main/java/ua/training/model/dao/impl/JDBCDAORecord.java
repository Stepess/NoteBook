package ua.training.model.dao.impl;

import ua.training.model.dao.RecordDAO;
import ua.training.model.dao.mapper.AddressMapper;
import ua.training.model.dao.mapper.RecordMapper;
import ua.training.model.entity.Address;
import ua.training.model.entity.Record;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class JDBCDAORecord implements RecordDAO {

    private Connection connection;
    private ResourceBundle rb;

    public JDBCDAORecord(Connection connection) {
        this.connection = connection;
        rb = ResourceBundle.getBundle("DB");
    }

    @Override
    public boolean create(Record obj) {
        return false;
    }

    @Override
    public Record findById(int id) {
        return null;
    }

    @Override
    public List<Record> findAll() {

        List<Record> records = new ArrayList<>();
        Map<Integer, Address> addresses = new HashMap<>();

        final String query = rb.getString("db.record.query.all");
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            RecordMapper recordMapper = new RecordMapper();
            AddressMapper addressMapper = new AddressMapper();

            while (rs.next()) {
                Record record = recordMapper
                        .extractFromResultSet(rs);
                Address address = addressMapper
                        .extractFromResultSet(rs);

                address = addressMapper
                        .makeUnique(addresses, address);
                record.setAddress(address);
                records.add(record);
            }
            return records;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean update(Record obj) {
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
