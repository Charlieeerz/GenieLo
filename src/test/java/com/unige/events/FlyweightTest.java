package com.unige.events;

import com.unige.events.flyweight.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {

    @Test
    void testFlyweightReusesCategories() {
        EventCategory sport1 = CategoryFactory.getCategory("Sport");
        EventCategory sport2 = CategoryFactory.getCategory("Sport");

        assertSame(sport1, sport2); // même instance réutilisée
        assertEquals(1, CategoryFactory.getCategoryCount());

        EventWithCategory event = new EventWithCategory("Tournoi de foot", sport1);
        assertEquals("Tournoi de foot in category Sport", event.getDetails());
    }
}