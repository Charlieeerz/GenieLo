package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @Test
    void testStudentFactory() {
        AbstractFactoryDemo.AbstractEventFactory factory = new AbstractFactoryDemo.StudentEventFactory();
        assertEquals("Liste des événements filtrés par faculté/intérêts (étudiant)",
                     factory.createEventList("student").showList());
        assertEquals("Détails pratiques pour l’étudiant (inscription, rappel, ticket)",
                     factory.createEventDetails("student").showDetails());
    }

    @Test
    void testAssociationFactory() {
        AbstractFactoryDemo.AbstractEventFactory factory = new AbstractFactoryDemo.AssociationEventFactory();
        assertEquals("Liste des événements créés par l’association",
                     factory.createEventList("association").showList());
        assertEquals("Détails de gestion pour l’association (tickets, stats, organisation)",
                     factory.createEventDetails("association").showDetails());
    }
}
