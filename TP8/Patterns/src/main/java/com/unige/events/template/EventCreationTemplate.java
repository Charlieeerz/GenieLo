package com.unige.events.template;

public abstract class EventCreationTemplate {

    // Template method
    public final String createEvent(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("Creating event: ").append(name).append("\n");
        sb.append(setupProfile()).append("\n");
        sb.append(addDetails()).append("\n");
        sb.append(publishEvent()).append("\n");
        return sb.toString();
    }

    protected abstract String setupProfile();
    protected abstract String addDetails();

    protected String publishEvent() {
        return "Event published to UNIGE platform";
    }
}