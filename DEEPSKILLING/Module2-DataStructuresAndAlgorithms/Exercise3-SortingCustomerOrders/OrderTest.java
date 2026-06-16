public class OrderTest {

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Bhavani", 4500),
                new Order(102, "Darani", 1200),
                new Order(103, "Rahul", 7600),
                new Order(104, "Priya", 3200)
        };

        System.out.println("Bubble Sort Result:");
        OrderSorter.bubbleSort(orders1);
        OrderSorter.displayOrders(orders1);

        System.out.println("\nQuick Sort Result:");

        Order[] orders2 = {
                new Order(101, "Bhavani", 4500),
                new Order(102, "Darani", 1200),
                new Order(103, "Rahul", 7600),
                new Order(104, "Priya", 3200)
        };

        OrderSorter.quickSort(orders2, 0, orders2.length - 1);
        OrderSorter.displayOrders(orders2);
    }
}