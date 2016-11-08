package com.yet.spring.serzh;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Serzh on 11/8/16.
 */
public class Event {

    int id = new Random().nextInt();
    String msg;
    Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
