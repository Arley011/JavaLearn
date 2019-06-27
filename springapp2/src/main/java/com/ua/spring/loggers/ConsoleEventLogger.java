package com.ua.spring.loggers;

import com.ua.spring.beans.Event;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event){
        System.out.println(event.toString());
    }
}
