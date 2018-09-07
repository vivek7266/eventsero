# eventsero

Dropwizard based REST APIs for Organizers.

## Requirements
 - JAVA 10 or higher
 - MySQL Ver 8.0.12 or higher
 - Apache Maven 3.5.4 or higher
 
This is a maven based project. All the dependencies are in `pom.xml`. 
 
Steps to run:
  - create a mysql database: eventsero
  - ceate the tables as mentioned here.
  - run `mvn clean install`
  - java - jar target/eventing-1.0-SNAPSHOT.jar server server src/main/resources/config-files/dev.yml

Voila!
 - Go to http://localhost:9000/v1/event
 - your jetty server has started on port 9000.
 
 
