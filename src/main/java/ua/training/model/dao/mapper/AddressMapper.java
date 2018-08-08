package ua.training.model.dao.mapper;

import ua.training.model.entity.Address;

import java.sql.ResultSet;
import java.util.Map;

public class AddressMapper implements ObjectMapper<Address> {
    @Override
    public Address extractFromResultSet(ResultSet rs) {
        return null;
    }

    @Override
    public Address makeUnique(Map<Integer, Address> cache, Address obj) {
        return null;
    }
}
