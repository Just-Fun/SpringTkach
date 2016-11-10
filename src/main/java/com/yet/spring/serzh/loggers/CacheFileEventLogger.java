package com.yet.spring.serzh.loggers;

import com.yet.spring.serzh.beans.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serzh on 11/8/16.
 */
public class CacheFileEventLogger extends FileEventLogger {
    int cacheSize;
    List<Event> cache;

    public CacheFileEventLogger(String filename, int cacheSize) {
        super(filename);
        this.cacheSize = cacheSize;
        this.cache = new ArrayList<>(cacheSize);
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            super.logEvent(event);
//            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy() {
        if (!cache.isEmpty()) {
//            super.logEvent(event);
            writeEventsFromCache();
        }
    }

    private void writeEventsFromCache() {

    }
}
