package com.unige.events.template;

public class StudentEventCreation extends EventCreationTemplate {
    @Override
    protected String setupProfile() {
        return "Student profile linked";
    }

    @Override
    protected String addDetails() {
        return "Details: free entry, casual event";
    }
}