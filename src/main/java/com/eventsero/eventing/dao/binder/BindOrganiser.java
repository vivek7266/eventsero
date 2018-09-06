package com.eventsero.eventing.dao.binder;

import com.eventsero.eventing.models.Organiser;
import org.skife.jdbi.v2.SQLStatement;
import org.skife.jdbi.v2.sqlobject.Binder;
import org.skife.jdbi.v2.sqlobject.BinderFactory;
import org.skife.jdbi.v2.sqlobject.BindingAnnotation;

import java.lang.annotation.*;


@BindingAnnotation(BindOrganiser.OrganiserBinderFactory.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface BindOrganiser {

    public static class OrganiserBinderFactory implements BinderFactory {

        @Override
        public Binder build(Annotation annotation) {
            return new Binder<BindOrganiser, Organiser>() {
                @Override
                public void bind(SQLStatement<?> q, BindOrganiser bind, Organiser organiser) {
                    try {
                        q.bind("id", organiser.getId());
                        q.bind("name", organiser.getName());
                        q.bind("type", organiser.getType());
                        q.bind("description", organiser.getDescription());
                        q.bind("contact_person", organiser.getContactPerson());
                        q.bind("contact_number", organiser.getContactNumber());
                        q.bind("contact_email", organiser.getContactEmail());
                        q.bind("contact_address", organiser.getContactAddress());
                        q.bind("created_at", organiser.getCratedAt());
                        q.bind("is_active", organiser.getIsActive());
                    } catch (Exception e) {
                        System.out.println("Exception in binding Organiser : " + e.getMessage());
                    }
                }
            };
        }
    }
}
