package com.eventsero.eventing.dao.mapper;

import com.eventsero.eventing.models.Event;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EventMapper implements ResultSetMapper<Event> {

    public Event map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Event(r.getInt("id"), r.getString("name"), r.getString("description"), r.getInt("type_id"), (FileInputStream) r.getBlob("image"), r.getString("location"), r.getDouble("lat"), r.getDouble("lng"), r.getTimestamp("start_date"), r.getTimestamp("end_date"), r.getInt("organiser_id"), r.getString("short_link"), r.getTimestamp("created_at"), r.getBoolean("is_active"));
    }
}
