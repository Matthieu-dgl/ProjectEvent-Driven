package com.matthieudeglon.handler;

import com.matthieudeglon.event.Event;
import com.matthieudeglon.event.EventHandler;
import com.matthieudeglon.model.Task;
import com.matthieudeglon.util.SQLiteUtil;

public class UpdateTaskHandler implements EventHandler {
    @Override
    public void handle(Event event) {
        Task task = (Task) event.getPayload();
        SQLiteUtil.updateTask(task);
        System.out.println("Task updated: " + task);
    }
}
