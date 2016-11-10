package com.yet.spring.serzh.loggers;

import com.yet.spring.serzh.beans.Event;

/**
 * Created by Serzh on 11/8/16.
 */
public class ConsoleEventLogger implements EventLogger {
    @Override
    public void logEvent(Event event){
        System.out.println(event.toString());
    }
}
