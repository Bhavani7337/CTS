public class LibraryTest {

    public static void main(String[] args) {

       
        Book[] books = {
                new Book(101, "Algorithms", "Thomas Cormen"),
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(103, "Data Structures", "Seymour Lipschutz"),
                new Book(104, "Java Programming", "Herbert Schildt"),
                new Book(105, "Operating Systems", "Galvin")
        };

        System.out.println("Linear Search:");

        Book result1 =
                LibrarySearch.linearSearch(books, "Java Programming");

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Book Not Found");
        }

        System.out.println("\nBinary Search:");

        Book result2 =
                LibrarySearch.binarySearch(books, "Java Programming");

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Book Not Found");
        }
    }
}