package com.eventsero.eventing.service;

import com.eventsero.eventing.core.EventingEngine;
import com.eventsero.eventing.models.Event;
import com.eventsero.eventing.models.Organiser;
import com.eventsero.eventing.models.Participant;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class EventingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventingService.class);

    @Inject
    private EventingEngine eventingEngine;

    public boolean createEvent(Event event) {
        return eventingEngine.createEvent(event);
    }

    public List<Event> getAllEvents() {

        return eventingEngine.getAllEvents();
    }

    public boolean createOrganiser(Organiser organiser) {
        return eventingEngine.createOrganiser(organiser);
    }

    public List<Organiser> getAllOrganisers() {

        return eventingEngine.getAllOrganisers();
    }

    public boolean createParticipant(Participant participant) {
        return eventingEngine.createParticipant(participant);
    }

    public List<Participant> getAllParticipants() {

        return eventingEngine.getAllParticipants();
    }

}
