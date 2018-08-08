package ua.training.model.dao.mapper;

import ua.training.model.entity.Record;

import java.sql.ResultSet;
import java.util.Map;

public class RecordMapper implements ObjectMapper<Record> {
    @Override
    public Record extractFromResultSet(ResultSet rs) {
        return null;
    }

    @Override
    public Record makeUnique(Map<Integer, Record> cache, Record obj) {
        return null;
    }
}
