package com.eventsero.eventing.dao.mapper;

import com.eventsero.eventing.models.Participant;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ParticipantMapper implements ResultSetMapper<Participant> {
    @Override
    public Participant map(int i, ResultSet r, StatementContext ctx) throws SQLException {
        return new Participant(r.getInt("id"), r.getString("name"), r.getString("first_name"), r.getString("last_name"), r.getString("user_name"), r.getString("password"), r.getString("description"), r.getString("email"), r.getString("phone_number"), r.getString("address"), r.getTimestamp("created_at"), r.getBoolean("is_active"));
    }
}
