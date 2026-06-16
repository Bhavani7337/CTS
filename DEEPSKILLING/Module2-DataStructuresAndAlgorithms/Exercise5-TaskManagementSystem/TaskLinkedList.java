public class TaskLinkedList {

    private Task head;

    
    public void addTask(int taskId, String taskName, String status) {

        Task newTask = new Task(taskId, taskName, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newTask;
    }

    
    public Task searchTask(int taskId) {

        Task current = head;

        while (current != null) {

            if (current.taskId == taskId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    
    public void displayTasks() {

        Task current = head;

        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    
    public void deleteTask(int taskId) {

        if (head == null) {
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            return;
        }

        Task current = head;

        while (current.next != null &&
               current.next.taskId != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}