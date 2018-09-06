package com.eventsero.eventing;

import com.eventsero.eventing.config.CorsFilter;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.validation.ConstraintViolationException;


public abstract class BaseApplication<T extends Configuration> extends Application<T> {

    @Override
    public void initialize(Bootstrap<T> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(T configuration, Environment environment) throws Exception {
        environment.getObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        environment.getObjectMapper().disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        environment.jersey().register(CorsFilter.class);
        environment.jersey().register(ConstraintViolationException.class);
    }

}
