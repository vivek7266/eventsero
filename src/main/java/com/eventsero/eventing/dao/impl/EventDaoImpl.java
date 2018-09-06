package com.eventsero.eventing.dao.impl;

import com.eventsero.eventing.dao.EventDao;
import com.eventsero.eventing.dao.binder.BindEvent;
import com.eventsero.eventing.dao.mapper.EventMapper;
import com.eventsero.eventing.models.Event;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;


@RegisterMapper(EventMapper.class)
public class EventDaoImpl implements EventDao {
    @Override
    public void createTableIfNotExists() {

    }

    @Override
    @SqlQuery("SELECT * FROM event")
    public List<Event> findAll() {
        return null;
    }

    @Override
    @SqlQuery("SELECT * FROM event WHERE id = :id")
    public Event findById(@Bind("id") Integer id) {
        return null;
    }

    @Override
    @SqlQuery("SELECT EXISTS(SELECT 1 FROM event WHERE id = :id)")
    public boolean exists(@Bind("id") Integer id) {
        return false;
    }

    @Override
    @SqlUpdate("INSERT INTO event (name, description, type_id, image, location, lat, lng, start_date, end_date, organiser_id, short_link) VALUES (:name, :description, :type_id, :image, :location, :lat, :lng, :start_date, :end_date, :organiser_id, :short_link)")
    public void insert(@BindEvent Event event) {

    }

    @Override
    @SqlUpdate("UPDATE event SET name = :name, description = :description, type_id = :type_id, image = :image, location = :location, lat =:lat, lng = :lng, start_date = :start_date, end_date = :end_date, organiser_id = :organiser_id, short_link = :short_link ,is_active = :is_active WHERE id =:id")
    public void update(@BindEvent Event event, @Bind("id") Integer id) {

    }

    @Override
    @SqlUpdate("DELETE FROM event WHERE id = :id")
    public void delete(@Bind("id") Integer id) {

    }

    @Override
    @SqlUpdate("DELETE FROM event")
    public void deleteAll() {

    }

    @Override
    public void close() {

    }
}
