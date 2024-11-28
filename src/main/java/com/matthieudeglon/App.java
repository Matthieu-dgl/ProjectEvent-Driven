package com.matthieudeglon;

import com.matthieudeglon.event.Event;
import com.matthieudeglon.event.EventBus;
import com.matthieudeglon.event.EventType;
import com.matthieudeglon.handler.CreateTaskHandler;
import com.matthieudeglon.handler.DeleteTaskHandler;
import com.matthieudeglon.handler.ReadTaskHandler;
import com.matthieudeglon.handler.UpdateTaskHandler;
import com.matthieudeglon.model.Task;

public class App {
    public static void main(String[] args) {
        EventBus bus = new EventBus();

        bus.registerHandler(EventType.CREATE_TASK, new CreateTaskHandler());
        bus.registerHandler(EventType.READ_TASK, new ReadTaskHandler());
        bus.registerHandler(EventType.UPDATE_TASK, new UpdateTaskHandler());
        bus.registerHandler(EventType.DELETE_TASK, new DeleteTaskHandler());

        Task task1 = new Task(0, "Task 1", "First task description");
        bus.publish(new Event(EventType.CREATE_TASK, task1));

        bus.publish(new Event(EventType.READ_TASK, null));

        Task updatedTask = new Task(1, "Task 1 Updated", "Updated description");
        bus.publish(new Event(EventType.UPDATE_TASK, updatedTask));

        bus.publish(new Event(EventType.DELETE_TASK, 1));

        bus.publish(new Event(EventType.READ_TASK, null));
    }
}
