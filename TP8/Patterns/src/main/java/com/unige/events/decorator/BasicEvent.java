package com.unige.events.decorator;

public class BasicEvent implements Event {
    private final String name;

    public BasicEvent(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return "Event: " + name;
    }
}