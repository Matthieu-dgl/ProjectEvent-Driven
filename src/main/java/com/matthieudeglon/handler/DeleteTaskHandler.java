package com.matthieudeglon.handler;

import com.matthieudeglon.event.Event;
import com.matthieudeglon.event.EventHandler;
import com.matthieudeglon.util.SQLiteUtil;

public class DeleteTaskHandler implements EventHandler {
    @Override
    public void handle(Event event) {
        int taskId = (Integer) event.getPayload();
        SQLiteUtil.deleteTask(taskId);
        System.out.println("Task deleted with ID: " + taskId);
    }
}
