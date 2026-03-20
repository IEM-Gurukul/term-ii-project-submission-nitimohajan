import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        System.out.println("All Books:");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");

        boolean found = false;

        for (Book b : books) {
            if (b.isAvailable) {
                System.out.println(b.title + " by " + b.author);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books available right now.");
        }
    }

    public void showTotalBooks() {
        System.out.println("Total books in library: " + books.size());
    }
}