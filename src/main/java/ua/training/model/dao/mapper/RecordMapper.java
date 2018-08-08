package ua.training.model.dao.mapper;

import ua.training.model.entity.Record;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordMapper implements ObjectMapper<Record> {
    @Override
    public Record extractFromResultSet(ResultSet rs) throws SQLException {
        Record record = new Record();
        record.setLogin(rs.getString("login"));
        record.setEmail(rs.getString("email"));
        return record;
    }
}
