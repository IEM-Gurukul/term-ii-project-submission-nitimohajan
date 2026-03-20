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
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        boolean found = false;

        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b.getTitle() + " by " + b.getAuthor());
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

    public void searchBook(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + b.getTitle() + " by " + b.getAuthor());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found: " + title);
        }
    }
}