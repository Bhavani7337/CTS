public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(101, "Design Database", "Pending");
        taskList.addTask(102, "Develop API", "In Progress");
        taskList.addTask(103, "Testing", "Pending");

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearch Task:");
        Task task = taskList.searchTask(102);

        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println("\nDeleting Task 102...");
        taskList.deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        taskList.displayTasks();
    }
}