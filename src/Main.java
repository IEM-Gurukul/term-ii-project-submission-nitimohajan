public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(1, "The Alchemist", "Paulo Coelho");
        Book b2 = new Book(2, "Clean Code", "Robert C. Martin");
        Book b3 = new Book(3, "Data Structures in Java", "Seymour Lipschutz");

        Member m1 = new Member(101, "Niti");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.addMember(m1);

        library.showBooks();

        m1.borrowBook(b1);
        m1.borrowBook(b1);

        m1.returnBook(b1);

        m1.showBorrowedBooks();

        // SEARCH FEATURE TEST
        library.searchBook("Clean Code");
        library.searchBook("Harry Potter");
    }
}