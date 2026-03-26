import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Member m1 = new Member(101, "Niti");

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Register Member");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.showAllBooks();
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String borrow = sc.nextLine();

                    boolean foundBorrow = false;

                    for (Book b : library.books) {
                        if (b.getTitle().toLowerCase().contains(borrow.toLowerCase())) {
                            m1.borrowBook(b);
                            foundBorrow = true;
                            break;
                        }
                    }

                    if (!foundBorrow) {
                        System.out.println("Book not found or unavailable!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book title: ");
                    String ret = sc.nextLine();

                    boolean foundReturn = false;

                    for (Book b : library.books) {
                        if (b.getTitle().toLowerCase().contains(ret.toLowerCase())) {
                            m1.returnBook(b);
                            foundReturn = true;
                            break;
                        }
                    }

                    if (!foundReturn) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5:
                    System.out.println("1. Search by Title");
                    System.out.println("2. Search by ID");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();

                    if (searchChoice == 1) {
                        System.out.print("Enter title: ");
                        String searchTitle = sc.nextLine();
                        library.searchBookByTitle(searchTitle);
                    } else if (searchChoice == 2) {
                        System.out.print("Enter ID: ");
                        int searchId = sc.nextInt();
                        library.searchBookById(searchId);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 6:
                    System.out.print("Enter member ID: ");
                    int memId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();

                    Member newMember = new Member(memId, name);
                    library.addMember(newMember);
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }
}