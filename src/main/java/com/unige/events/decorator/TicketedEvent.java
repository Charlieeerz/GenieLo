package com.unige.events.decorator;

public class TicketedEvent extends EventDecorator {
    public TicketedEvent(Event decoratedEvent) {
        super(decoratedEvent);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Tickets available";
    }
}