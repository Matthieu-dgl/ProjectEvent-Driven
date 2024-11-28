package com.matthieudeglon.event;

public class Event {
    private final EventType type;
    private final Object payload;

    public Event(EventType type, Object payload) {
        this.type = type;
        this.payload = payload;
    }

    public EventType getType() {
        return type;
    }

    public Object getPayload() {
        return payload;
    }
}
