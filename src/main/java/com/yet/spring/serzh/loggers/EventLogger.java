package com.yet.spring.serzh.loggers;

import com.yet.spring.serzh.beans.Event;

/**
 * Created by Serzh on 11/8/16.
 */
public interface EventLogger {
    void logEvent(Event event);
}
