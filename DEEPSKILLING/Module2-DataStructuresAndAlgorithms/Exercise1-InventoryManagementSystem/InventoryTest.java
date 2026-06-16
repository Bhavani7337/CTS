public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 55000));
        manager.addProduct(new Product(102, "Mouse", 50, 500));

        System.out.println("\nInventory:");
        manager.displayProducts();

        manager.updateProduct(101, 15, 53000);

        System.out.println("\nAfter Update:");
        manager.displayProducts();

        manager.deleteProduct(102);

        System.out.println("\nAfter Deletion:");
        manager.displayProducts();
    }
}