package com.eventsero.eventing.dao.mapper;

import com.eventsero.eventing.models.Organiser;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class OrganiserMapper implements ResultSetMapper<Organiser> {
    @Override
    public Organiser map(int i, ResultSet r, StatementContext ctx) throws SQLException {
        return new Organiser(r.getInt("id"), r.getString("name"), r.getString("type"), r.getString("description"), r.getInt("contact_person"), r.getString("contact_number"), r.getString("contact_email"), r.getString("contact_address"), r.getTimestamp("created_at"), r.getBoolean("is_active"));
    }
}
