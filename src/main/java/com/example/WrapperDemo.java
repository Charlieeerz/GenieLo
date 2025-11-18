package com.example;
// Wrapper Pattern in one file
// Purpose: Encapsulate a primitive type or another object to provide additional functionality.
// Useful for adding validation, logging, or custom behavior around existing classes.

public class WrapperDemo {

    // --- Custom Wrapper class ---
    static class IntWrapper {
        private int value;

        public IntWrapper(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void increment() {
            value++;
        }

        public void decrement() {
            value--;
        }
    }

    // --- Demo main ---
    public static void main(String[] args) {
        IntWrapper w = new IntWrapper(10);
        System.out.println("Initial value: " + w.getValue());

        w.increment();
        System.out.println("After increment: " + w.getValue());

        w.decrement();
        System.out.println("After decrement: " + w.getValue());
    }
}
