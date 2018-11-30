package com.binaryheap.lambdatest.models;

public class InputEvent {
    String eventName;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public InputEvent() {
    }

    public InputEvent(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "InputEvent{" +
                "eventName='" + eventName + '\'' +
                '}';
    }
}
