package com.eventsero.eventing.config;


public class Settings {

    private EventingConfig config;

    private Settings() {
    }

    private static class LazyHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void init(EventingConfig config) {
        this.config = config;
    }

    public EventingConfig getConfig() {
        return config;
    }
}
