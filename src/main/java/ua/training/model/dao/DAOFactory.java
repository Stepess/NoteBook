package ua.training.model.dao;

import ua.training.model.dao.impl.JDBCDAOFactory;

public abstract class DAOFactory {
    private static DAOFactory daoFactory;

    public abstract AddressDAO createAddressDao();
    public abstract RecordDAO createRecordDao();

    public static DAOFactory getInstance() {
        if (daoFactory == null){
            synchronized (DAOFactory.class){
                if (daoFactory == null){
                    daoFactory = new JDBCDAOFactory();
                }
            }
        }
        return daoFactory;
    }

}
