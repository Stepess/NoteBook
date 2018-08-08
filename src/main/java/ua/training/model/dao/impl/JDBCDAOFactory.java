package ua.training.model.dao.impl;

import ua.training.model.dao.AddressDAO;
import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.RecordDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCDAOFactory extends DAOFactory {

    private ResourceBundle rb = ResourceBundle.getBundle("DB");

    private Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(rb.getString("db.connect.url"),
                    rb.getString("db.connect.user"),
                    rb.getString("db.connect.pass"));
        }
        catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public AddressDAO createAddressDao() {
        return new JDBCDAOAddress(getConnection());
    }

    @Override
    public RecordDAO createRecordDao() {
        return new JDBCDAORecord(getConnection());
    }
}
