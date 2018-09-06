package com.eventsero.eventing;

import com.eventsero.eventing.config.EventingConfig;
import com.eventsero.eventing.config.Settings;
import com.eventsero.eventing.dao.EventDao;
import com.eventsero.eventing.dao.OrganiserDao;
import com.eventsero.eventing.dao.ParticipantDao;
import com.eventsero.eventing.dao.impl.EventDaoImpl;
import com.eventsero.eventing.dao.impl.OrganiserDaoImpl;
import com.eventsero.eventing.dao.impl.ParticipantDaoImpl;
import com.eventsero.eventing.resource.EventingResource;
import com.eventsero.eventing.resource.OrganiserResource;
import com.eventsero.eventing.resource.ParticipantResource;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.skife.jdbi.v2.DBI;


public class EventingEngineApplication extends BaseApplication<EventingConfig> {

    @Override
    public void initialize(Bootstrap<EventingConfig> bootstrap) {
        bootstrap.addBundle(new ViewBundle<EventingConfig>());
        super.initialize(bootstrap);
    }

    @Override
    public void run(EventingConfig config, Environment environment) throws Exception {

        // MySQL Configuration
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, config.getDataSourceFactory(), "mysql");

        Settings.getInstance().init(config);
        Injector injector = createInjector(config, jdbi);
        environment.jersey().register(injector.getInstance(EventingResource.class));
        environment.jersey().register(injector.getInstance(OrganiserResource.class));
        environment.jersey().register(injector.getInstance(ParticipantResource.class));

        super.run(config, environment);
    }

    private Injector createInjector(final EventingConfig config, final DBI jdbi) {
        return Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {

                bind(DBI.class).toInstance(jdbi);
                bind(EventDao.class).to(EventDaoImpl.class);
                bind(OrganiserDao.class).to(OrganiserDaoImpl.class);
                bind(ParticipantDao.class).to(ParticipantDaoImpl.class);
                EventDaoImpl eventDao = jdbi.onDemand(EventDaoImpl.class);
                bind(EventDaoImpl.class).toInstance(eventDao);
                OrganiserDaoImpl organiserDao = jdbi.onDemand(OrganiserDaoImpl.class);
                bind(OrganiserDaoImpl.class).toInstance(organiserDao);
                ParticipantDaoImpl participantDao = jdbi.onDemand(ParticipantDaoImpl.class);
                bind(ParticipantDaoImpl.class).toInstance(participantDao);
                bind(EventingConfig.class).toInstance(config);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        new EventingEngineApplication().run(args);
    }
}
