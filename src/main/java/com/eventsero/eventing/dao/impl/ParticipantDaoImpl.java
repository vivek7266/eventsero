package com.eventsero.eventing.dao.impl;

import com.eventsero.eventing.dao.ParticipantDao;
import com.eventsero.eventing.dao.binder.BindParticipant;
import com.eventsero.eventing.dao.mapper.ParticipantMapper;
import com.eventsero.eventing.models.Participant;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;


@RegisterMapper(ParticipantMapper.class)
public class ParticipantDaoImpl implements ParticipantDao {
    @Override
    public void createTableIfNotExists() {

    }

    @Override
    @SqlQuery("SELECT * FROM participant")
    public List<Participant> findAll() {
        return null;
    }

    @Override
    @SqlQuery("SELECT * FROM participant WHERE id = :id")
    public Participant findById(@Bind("id") Integer id) {
        return null;
    }

    @Override
    @SqlQuery("SELECT EXISTS(SELECT 1 FROM participant WHERE id = :id)")
    public boolean exists(@Bind("id") Integer id) {
        return false;
    }

    @Override
    @SqlUpdate("INSERT INTO participant (name, first_name, last_name, user_name, password, description, email, phone_number, address) VALUES (:name, :first_name, :last_name, :user_name, :password, :description, :email, :phone_number, :address)")
    public void insert(@BindParticipant Participant participant) {

    }

    @Override
    @SqlUpdate("UPDATE participant SET name = :name, first_name = :first_name, last_name = :last_name, user_name = :user_name, password = :password, description = :description, email = :email, phone_number = :phone_number, address = :address, is_active = :is_active WHERE id = :id")
    public void update(@BindParticipant Participant participant, @Bind("id") Integer id) {

    }

    @Override
    @SqlUpdate("DELETE FROM participant WHERE id = :id")
    public void delete(@Bind("id") Integer id) {

    }

    @Override
    @SqlUpdate("DELETE FROM participant")
    public void deleteAll() {

    }

    @Override
    public void close() {

    }
}
