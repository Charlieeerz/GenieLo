package com.unige.events.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CategoryFactory {
    private static final Map<String, EventCategory> categories = new HashMap<>();

    public static EventCategory getCategory(String name) {
        return categories.computeIfAbsent(name, EventCategory::new);
    }

    public static int getCategoryCount() {
        return categories.size();
    }
}