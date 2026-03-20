import java.util.ArrayList;

public class Member {
    int memberId;
    String name;
    ArrayList<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println(name + " borrowed: " + book.title);
        } else {
            System.out.println("Sorry, " + book.title + " is not available.");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
        System.out.println(name + " returned: " + book.title);
    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book b : borrowedBooks) {
            System.out.println(b.title);
        }
    }
}
