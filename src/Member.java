import java.util.ArrayList;

public class Member extends User {
    int memberId;
    ArrayList<Book> borrowedBooks;

    public Member(int memberId, String name) {
        super(name);
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow: " + book.getTitle());
        }
    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
            return;
        }

        for (Book b : borrowedBooks) {
            System.out.println(b.getTitle());
        }
    }
}