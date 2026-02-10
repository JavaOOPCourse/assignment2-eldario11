public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        // implement
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        this.isAvailable = false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        this.isAvailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Title: " + title + "Author: " + author + "Year: " + year + "Availabel: " + isAvailable;
    }

    // TODO: Override equals()
    public boolean equals(Book book) {
        return title.equals(book.getTitle()) && author.equals(book.getAuthor()) && year == book.getYear();
    }
}
