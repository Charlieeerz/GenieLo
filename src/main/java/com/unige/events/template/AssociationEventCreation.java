package com.unige.events.template;


public class AssociationEventCreation extends EventCreationTemplate {
    @Override
    protected String setupProfile() {
        return "Association profile linked";
    }

    @Override
    protected String addDetails() {
        return "Details: ticketing enabled, official event";
    }
}