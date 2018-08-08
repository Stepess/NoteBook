package ua.training.model.dao;

import java.util.List;

public interface GenericDAO<T> extends AutoCloseable {
    boolean create(T obj);
    T findById(int id);
    List<T> findAll();
    boolean update(T obj);
    boolean delete(int id);
    void close();
}
