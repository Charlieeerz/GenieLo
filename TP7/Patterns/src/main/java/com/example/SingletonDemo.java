package com.example;
// Singleton Pattern in one file
// Purpose: Ensure only one instance of a class exists in the application.
// Useful for shared resources like configuration, logging, or database connections.

public class SingletonDemo {

    // --- Singleton class ---
    static class Singleton {
        private static Singleton instance;

        private Singleton() {
            // private constructor prevents instantiation
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public String getMessage() {
            return "Hello from Singleton!";
        }
    }

    // --- Demo main ---
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1.getMessage());
        System.out.println("Same instance? " + (s1 == s2));
    }
}
