public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(
                new Employee(101, "Bhavani", "Developer", 50000));

        manager.addEmployee(
                new Employee(102, "Darani", "Tester", 40000));

        manager.addEmployee(
                new Employee(103, "Rahul", "Manager", 70000));

        System.out.println("\nAll Employees:");
        manager.displayEmployees();

        System.out.println("\nSearch Employee:");
        System.out.println(manager.searchEmployee(102));

        System.out.println("\nDelete Employee:");
        manager.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        manager.displayEmployees();
    }
}