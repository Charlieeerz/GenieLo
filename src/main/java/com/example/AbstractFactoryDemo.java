package com.example;
// Abstract Factory Pattern in one file
// Purpose: Provide an interface for creating families of related objects
// (EventList + EventDetails) without specifying their concrete classes.

public class AbstractFactoryDemo {

    // --- Abstract Factory ---
    static abstract class AbstractEventFactory {
        public abstract EventList createEventList(String userContext);
        public abstract EventDetails createEventDetails(String userContext);
    }

    // --- Products (interfaces) ---
    interface EventList {
        String showList();
    }

    interface EventDetails {
        String showDetails();
    }

    // --- Concrete Factories ---
    static class StudentEventFactory extends AbstractEventFactory {
        @Override
        public EventList createEventList(String userContext) {
            return new StudentEventList();
        }
        @Override
        public EventDetails createEventDetails(String userContext) {
            return new StudentEventDetails();
        }
    }

    static class AssociationEventFactory extends AbstractEventFactory {
        @Override
        public EventList createEventList(String userContext) {
            return new AssociationEventList();
        }
        @Override
        public EventDetails createEventDetails(String userContext) {
            return new AssociationEventDetails();
        }
    }

    // --- Concrete Products ---
    static class StudentEventList implements EventList {
        public String showList() {
            return "Liste des événements filtrés par faculté/intérêts (étudiant)";
        }
    }

    static class AssociationEventList implements EventList {
        public String showList() {
            return "Liste des événements créés par l’association";
        }
    }

    static class StudentEventDetails implements EventDetails {
        public String showDetails() {
            return "Détails pratiques pour l’étudiant (inscription, rappel, ticket)";
        }
    }

    static class AssociationEventDetails implements EventDetails {
        public String showDetails() {
            return "Détails de gestion pour l’association (tickets, stats, organisation)";
        }
    }

    // --- Demo main ---
    public static void main(String[] args) {
        AbstractEventFactory studentFactory = new StudentEventFactory();
        System.out.println(studentFactory.createEventList("student").showList());
        System.out.println(studentFactory.createEventDetails("student").showDetails());

        AbstractEventFactory associationFactory = new AssociationEventFactory();
        System.out.println(associationFactory.createEventList("association").showList());
        System.out.println(associationFactory.createEventDetails("association").showDetails());
    }
}
