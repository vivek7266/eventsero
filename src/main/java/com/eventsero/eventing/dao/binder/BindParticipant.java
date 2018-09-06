package com.eventsero.eventing.dao.binder;

import com.eventsero.eventing.models.Participant;
import org.skife.jdbi.v2.SQLStatement;
import org.skife.jdbi.v2.sqlobject.Binder;
import org.skife.jdbi.v2.sqlobject.BinderFactory;
import org.skife.jdbi.v2.sqlobject.BindingAnnotation;

import java.lang.annotation.*;


@BindingAnnotation(BindParticipant.ParticipantBinderFactory.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface BindParticipant {

    public static class ParticipantBinderFactory implements BinderFactory {

        @Override
        public Binder build(Annotation annotation) {
            return new Binder<BindParticipant, Participant>() {
                @Override
                public void bind(SQLStatement<?> q, BindParticipant bind, Participant participant) {
                    try {
                        q.bind("id", participant.getId());
                        q.bind("name", participant.getName());
                        q.bind("first_name", participant.getFirstName());
                        q.bind("last_name", participant.getLastName());
                        q.bind("user_name", participant.getUserName());
                        q.bind("password", participant.getPassword());
                        q.bind("description", participant.getDescription());
                        q.bind("email", participant.getEmail());
                        q.bind("address", participant.getAddress());
                        q.bind("created_at", participant.getCreatedAt());
                        q.bind("is_active", participant.getIsActive());
                    } catch (Exception e) {
                        System.out.println("Exception in binding Participant : " + e.getMessage());
                    }
                }
            };
        }
    }

}
