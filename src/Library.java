import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;
    public ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void addMember(Member m) {
        members.add(m);
        System.out.println("Member registered: " + m.getName());
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }

        System.out.println("Books in Library:");
        int i = 1;

        for (Book b : books) {
            String status = b.isAvailable() ? "Available" : "Not Available";
            System.out.println(i + ". " + b.getTitle() + " by " + b.getAuthor() + " (" + status + ")");
            i++;
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found: " + b.getTitle() + " by " + b.getAuthor());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void searchBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                System.out.println("Found: " + b.getTitle() + " by " + b.getAuthor());
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void showTotalBooks() {
        System.out.println("Total books in library: " + books.size());
    }
}