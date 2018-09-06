package com.eventsero.eventing.dao;

import java.util.List;


public interface GenericDao<T> {

    void createTableIfNotExists();

    List<T> findAll();

    T findById(Integer id);

    boolean exists(Integer id);

    void insert(T t);

    void update(T t, Integer id);

    void delete(Integer id);

    void deleteAll();

    void close();
}
