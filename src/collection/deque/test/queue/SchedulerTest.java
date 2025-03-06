package collection.deque.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        // 낮에 작업을 저장
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanTask());

        run(scheduler);
        run(scheduler);
        run(scheduler);
        run(scheduler);
    }

    private static void run(TaskScheduler scheduler) {
        if (scheduler.getRemainingTasks() > 0) {
            scheduler.processNextTask();
        } else {
            System.out.println("No more tasks");
        }
    }
}
