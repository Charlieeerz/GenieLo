package com.unige.events;

import com.unige.events.template.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemplateMethodTest {

    @Test
    void testStudentEventCreation() {
        EventCreationTemplate studentEvent = new StudentEventCreation();
        String result = studentEvent.createEvent("Karaoke Night");

        assertTrue(result.contains("Student profile linked"));
        assertTrue(result.contains("Event published"));
    }

    @Test
    void testAssociationEventCreation() {
        EventCreationTemplate assocEvent = new AssociationEventCreation();
        String result = assocEvent.createEvent("Conference AI");

        assertTrue(result.contains("Association profile linked"));
        assertTrue(result.contains("ticketing enabled"));
    }
}
