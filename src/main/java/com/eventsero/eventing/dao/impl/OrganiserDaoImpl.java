package com.eventsero.eventing.dao.impl;

import com.eventsero.eventing.dao.OrganiserDao;
import com.eventsero.eventing.dao.binder.BindOrganiser;
import com.eventsero.eventing.dao.mapper.OrganiserMapper;
import com.eventsero.eventing.models.Organiser;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;


@RegisterMapper(OrganiserMapper.class)
public class OrganiserDaoImpl implements OrganiserDao {
    @Override
    public void createTableIfNotExists() {

    }

    @Override
    @SqlQuery("SELECT * FROM organiser")
    public List<Organiser> findAll() {
        return null;
    }

    @Override
    @SqlQuery("SELECT * FROM organiser WHERE id = :id")
    public Organiser findById(@Bind("id") Integer id) {
        return null;
    }

    @Override
    @SqlQuery("SELECT EXISTS(SELECT 1 FROM organiser WHERE id = :id)")
    public boolean exists(@Bind("id") Integer id) {
        return false;
    }

    @Override
    @SqlUpdate("INSERT INTO organiser (name, type, description, contact_person, contact_number, contact_email, contact_address) VALUES (:name, :type, :description, :contact_person, :contact_number, :contact_email, :contact_address)")
    public void insert(@BindOrganiser Organiser organiser) {

    }

    @Override
    @SqlUpdate("UPDATE organiser SET name = :name, type = :type, description = :description, contact_person = :contact_person, contact_number = :contact_number, contact_email = :contact_email, contact_address = :contact_address, is_active = :is_active WHERE id = :id")
    public void update(@BindOrganiser Organiser organiser, @Bind("id") Integer id) {

    }

    @Override
    @SqlUpdate("DELETE FROM organiser WHERE id = :id")
    public void delete(@Bind("id") Integer id) {

    }

    @Override
    @SqlUpdate("DELETE FROM organiser")
    public void deleteAll() {

    }

    @Override
    public void close() {

    }
}
