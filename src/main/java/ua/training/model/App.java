package ua.training.model;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.RecordDAO;
import ua.training.model.entity.Record;

import java.util.List;

public class App {
    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        List<Record> records=null;
        try (RecordDAO recordDAO = daoFactory.createRecordDao();){
            records = recordDAO.findAll();
        }
        records.forEach(System.out::println);
    }
}
