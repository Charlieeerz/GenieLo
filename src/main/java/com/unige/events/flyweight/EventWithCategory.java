package com.unige.events.flyweight;

public class EventWithCategory {
    private final String eventName;
    private final EventCategory category;

    public EventWithCategory(String eventName, EventCategory category) {
        this.eventName = eventName;
        this.category = category;
    }

    public String getDetails() {
        return eventName + " in category " + category.getName();
    }
}
