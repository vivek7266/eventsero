package com.eventsero.eventing.core;

import com.eventsero.eventing.dao.EventDao;
import com.eventsero.eventing.dao.OrganiserDao;
import com.eventsero.eventing.dao.ParticipantDao;
import com.eventsero.eventing.models.Event;
import com.eventsero.eventing.models.Organiser;
import com.eventsero.eventing.models.Participant;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class EventingEngine {

    private static Logger LOGGER = LoggerFactory.getLogger(EventingEngine.class);

    @Inject
    EventDao eventDao;

    @Inject
    OrganiserDao organiserDao;

    @Inject
    ParticipantDao participantDao;

    public boolean createEvent(Event event) {
        boolean isSet = false;
        try {
            eventDao.insert(event);
            isSet = true;
        } catch (Exception e) {
            LOGGER.error("Exception in inserting event in database: " + e.getMessage());
        }
        return isSet;
    }

    public List<Event> getAllEvents() {
        List<Event> events = null;
        try {
            events = eventDao.findAll();
        } catch (Exception e) {
            LOGGER.error("Exception in getting all events: " + e.getMessage());
        }
        return events;
    }

    public boolean createOrganiser(Organiser organiser) {
        boolean isSet = false;
        try {
            organiserDao.insert(organiser);
            isSet = true;
        } catch (Exception e) {
            LOGGER.error("Exception in inserting event in database: " + e.getMessage());
        }
        return isSet;
    }

    public List<Organiser> getAllOrganisers() {
        List<Organiser> organisers = null;
        try {
            organisers = organiserDao.findAll();
        } catch (Exception e) {
            LOGGER.error("Exception in getting all events: " + e.getMessage());
        }
        return organisers;
    }

    public boolean createParticipant(Participant participant) {
        boolean isSet = false;
        try {
            participantDao.insert(participant);
            isSet = true;
        } catch (Exception e) {
            LOGGER.error("Exception in inserting event in database: " + e.getMessage());
        }
        return isSet;
    }

    public List<Participant> getAllParticipants() {
        List<Participant> participants = null;
        try {
            participants = participantDao.findAll();
        } catch (Exception e) {
            LOGGER.error("Exception in getting all events: " + e.getMessage());
        }
        return participants;
    }
}
