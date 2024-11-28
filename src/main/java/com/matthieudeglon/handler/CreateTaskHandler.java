package com.matthieudeglon.handler;

import com.matthieudeglon.event.Event;
import com.matthieudeglon.event.EventHandler;
import com.matthieudeglon.model.Task;
import com.matthieudeglon.util.SQLiteUtil;

public class CreateTaskHandler implements EventHandler {
    @Override
    public void handle(Event event) {
        Task task = (Task) event.getPayload();
        SQLiteUtil.createTask(task);
        System.out.println("Task created: " + task);
    }
}