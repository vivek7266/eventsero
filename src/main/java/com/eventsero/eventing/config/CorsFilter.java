package com.eventsero.eventing.config;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;


public class CorsFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT");

        String reqHead = requestContext.getHeaderString("Access-Control-Request-Headers");

        if (!(reqHead == null || reqHead.equals(""))) {
            responseContext.getHeaders().add("Access-Control-Allow-Headers", reqHead);
        }
    }
}
