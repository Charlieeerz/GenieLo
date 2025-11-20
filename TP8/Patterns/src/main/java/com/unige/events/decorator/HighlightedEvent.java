package com.unige.events.decorator;

public class HighlightedEvent extends EventDecorator {
    public HighlightedEvent(Event decoratedEvent) {
        super(decoratedEvent);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Highlighted";
    }
}