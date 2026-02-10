public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if(count >= books.length) {
            System.out.println("No availabel places!");
        }else {
            books[count++] = book;
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        for(Book b : books) {
            if (b != null) {
                System.out.println(b.toString());
            }
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for(Book b : books) {
            if (b != null && b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        for(Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    book.borrowBook();
                    System.out.println("Successfully borrowed");
                } else {
                    System.out.println("Already borrowed");
                }
                return;
            }
        }
        System.out.println("Invalid request");
        return;
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        for(Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                if (!book.isAvailable()) {
                    book.returnBook();
                    System.out.println("Successfully returned");
                } else {
                    System.out.println("This book wasn't borrowed");
                }
                return;
            }
        }
        System.out.println("Invalid request");
        return;
    }
}
