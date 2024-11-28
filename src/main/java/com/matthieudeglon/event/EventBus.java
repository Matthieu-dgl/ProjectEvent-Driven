package com.matthieudeglon.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    private final Map<EventType, List<EventHandler>> handlers = new HashMap<>();

    public void registerHandler(EventType type, EventHandler handler) {
        handlers.computeIfAbsent(type, k -> new ArrayList<>()).add(handler);
    }

    public void publish(Event event) {
        List<EventHandler> eventHandlers = handlers.get(event.getType());
        if (eventHandlers != null) {
            eventHandlers.forEach(handler -> handler.handle(event));
        }
    }
}
