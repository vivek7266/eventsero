package com.eventsero.eventing.resource;

import com.codahale.metrics.annotation.Timed;
import com.eventsero.eventing.models.Event;
import com.eventsero.eventing.service.EventingService;
import com.google.inject.Inject;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/{parameter : v1}/event")
@Api(value = "/event", description = "Operations on eventing")
public class EventingResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventingResource.class);

    @Inject
    EventingService eventingService;

    @Timed
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    @ApiOperation(value = "Returns the permissions", notes = "Gets the permissions", response = Response.class)
    public Response createEventingModel(Event event) {

        boolean o = eventingService.createEvent(event);

        return Response.ok().entity(o).build();
    }

    @Timed
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    @ApiOperation(value = "", notes = "", response = Response.class)
    public Response getAllEvents() {

        List<Event> data = eventingService.getAllEvents();

        return Response.ok().entity(data).build();
    }
}
