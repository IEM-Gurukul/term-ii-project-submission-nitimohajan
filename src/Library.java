import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void showBooks() {
        System.out.println("Books in Library:");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }

    // NEW FEATURE (Commit 7)
    public void searchBook(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + b.title + " by " + b.author);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found: " + title);
        }
    }
}