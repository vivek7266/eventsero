package com.eventsero.eventing.dao.binder;

import com.eventsero.eventing.models.Event;
import org.skife.jdbi.v2.SQLStatement;
import org.skife.jdbi.v2.sqlobject.Binder;
import org.skife.jdbi.v2.sqlobject.BinderFactory;
import org.skife.jdbi.v2.sqlobject.BindingAnnotation;

import java.lang.annotation.*;


@BindingAnnotation(BindEvent.EventBinderFactory.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface BindEvent {

    public static class EventBinderFactory implements BinderFactory {

        @Override
        public Binder build(Annotation annotation) {
            return new Binder<BindEvent, Event>() {
                @Override
                public void bind(SQLStatement<?> q, BindEvent bind, Event event) {
                    try {
                        q.bind("id", event.getId());
                        q.bind("name", event.getName());
                        q.bind("description", event.getDescription());
                        q.bind("type_id", event.getTypeId());
                        q.bind("image", event.getImage());
                        q.bind("location", event.getLocation());
                        q.bind("lat", event.getLat());
                        q.bind("lng", event.getLng());
                        q.bind("start_date", event.getStartDate());
                        q.bind("end_date", event.getEndDate());
                        q.bind("organiser_id", event.getOrganiserId());
                        q.bind("short_link", event.getShortLink());
                        q.bind("created_at", event.getCreatedAt());
                        q.bind("is_active", event.getIsActive());
                    } catch (Exception e) {
                        System.out.println("Exception in binding Event : " + e.getMessage());
                    }
                }
            };
        }
    }
}
