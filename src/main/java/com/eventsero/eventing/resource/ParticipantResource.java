package com.eventsero.eventing.resource;

import com.codahale.metrics.annotation.Timed;
import com.eventsero.eventing.models.Participant;
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


@Path("/{parameter : v1}/participant")
@Api(value = "/participant", description = "Operations on organiser")
public class ParticipantResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventingResource.class);

    @Inject
    EventingService eventingService;

    @Timed
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    @ApiOperation(value = "Returns the permissions", notes = "Gets the permissions", response = Response.class)
    public Response createOrganiser(Participant participant) {

        boolean o = eventingService.createParticipant(participant);

        return Response.ok().entity(o).build();
    }

    @Timed
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    @ApiOperation(value = "Returns the permissions", notes = "Gets the permissions", response = Response.class)
    public Response getAllEvents() {

        List<Participant> data = eventingService.getAllParticipants();

        return Response.ok().entity(data).build();
    }
}
