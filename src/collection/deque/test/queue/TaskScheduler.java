package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private final Deque<Task> taskDeque = new ArrayDeque<>();

    public void addTask(Task task) {
        taskDeque.offer(task);
    }

    public void processNextTask() {
        Task task = taskDeque.poll();
        if (task != null) {
            task.execute();
        }
    }

    public int getRemainingTasks() {
        return taskDeque.size();
    }
}
