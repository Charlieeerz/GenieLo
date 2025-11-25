package com.unige.events.decorator;

public abstract class EventDecorator implements Event {
    protected Event decoratedEvent;

    public EventDecorator(Event decoratedEvent) {
        this.decoratedEvent = decoratedEvent;
    }

    @Override
    public String getDetails() {
        return decoratedEvent.getDetails();
    }
}