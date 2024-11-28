package com.matthieudeglon.handler;

import com.matthieudeglon.event.Event;
import com.matthieudeglon.event.EventHandler;
import com.matthieudeglon.util.SQLiteUtil;

public class ReadTaskHandler implements EventHandler {
    @Override
    public void handle(Event event) {
        System.out.println("All tasks: ");
        SQLiteUtil.readTasks().forEach(System.out::println);
    }
}
