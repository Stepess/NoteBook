package ua.training.model.dao.mapper;

import ua.training.model.entity.Address;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class AddressMapper implements ObjectMapper<Address> {
    @Override
    public Address extractFromResultSet(ResultSet rs) throws SQLException {
        Address address = new Address();
        address.setCountry(rs.getString("country"));
        address.setCity(rs.getString("city"));
        return address;
    }

    public Address makeUnique(Map<Integer, Address> cache, Address address) {
        cache.putIfAbsent(address.hashCode(), address);
        return cache.get(address.hashCode());
    }
}
