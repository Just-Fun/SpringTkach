package com.yet.spring.serzh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Serzh on 11/8/16.
 */
public class App {
    Client client;
    EventLogger eventLogger;
    Event event;

    public App(Client client, EventLogger eventLogger, Event event) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.event = event;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        App app2 = ctx.getBean(App.class);

        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");

        app2.logEvent("Some event for user 1");
        ctx.close();
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(event);
    }
}
