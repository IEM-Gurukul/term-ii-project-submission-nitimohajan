public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(1, "Harry Potter", "J.K. Rowling");
        Book b2 = new Book(2, "Atomic Habits", "James Clear");
        Book b3 = new Book(3, "Rich Dad Poor Dad", "Robert Kiyosaki");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Member m1 = new Member(101, "Niti");

        System.out.println("Library Management System Started\n");

        library.showAllBooks();
        System.out.println();

        m1.borrowBook(b1);
        m1.borrowBook(b2);

        System.out.println();

        library.showAvailableBooks();
        System.out.println();

        m1.showBorrowedBooks();

        library.showTotalBooks();
    }
}