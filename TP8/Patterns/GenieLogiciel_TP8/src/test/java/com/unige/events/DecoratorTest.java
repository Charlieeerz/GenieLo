package com.unige.events;

import com.unige.events.decorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void testDecoratorAddsFeatures() {
        Event event = new BasicEvent("UNIGE Hackathon");
        event = new TicketedEvent(event);
        event = new HighlightedEvent(event);

        String details = event.getDetails();
        assertTrue(details.contains("Event: UNIGE Hackathon"));
        assertTrue(details.contains("Tickets available"));
        assertTrue(details.contains("Highlighted"));
    }
}