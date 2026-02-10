import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    library.addBook(new Book(title, author, year));
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Title: ");
                    String Etitle = scanner.nextLine();
                    System.out.println("Author: ");
                    String Eauthor = scanner.nextLine();
                    System.out.println("Year: ");
                    int Eyear = Integer.parseInt(scanner.nextLine());
                    System.out.println("File size: ");
                    double fileSize = Double.parseDouble(scanner.nextLine());
                    library.addBook(new EBook(Etitle, Eauthor, Eyear, fileSize));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("Title: ");
                    String Stitle = scanner.nextLine();
                    if(library.searchByTitle(Stitle) != null) {
                        System.out.println(library.searchByTitle(Stitle));
                    }else {
                        System.out.println("Not found");
                    }
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Title: ");
                    String Btitle = scanner.nextLine();
                    library.borrowBook(Btitle);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Title: ");
                    String Rtitle = scanner.nextLine();
                    library.returnBook(Rtitle);
                break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }

    private static Scanner getScanner(Scanner scanner) {
        return scanner;
    }
}
