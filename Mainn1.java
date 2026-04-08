// Encapsulation Example - Library Management System

class Book {
    // Private variables (data hiding)
    private String title;
    private String author;
    private int bookId;
    private boolean isIssued;

    // Constructor
    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isIssued = false;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Setter with validation
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title!");
        }
    }

    // Issue book
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued!");
        }
    }

    // Return book
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued!");
        }
    }

    // Display details
    public void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
    }
}

// Main class
public class Mainn1 {
    public static void main(String[] args) {
        // Create objects
        Book b1 = new Book("Java Programming", "James Gosling", 101);
        Book b2 = new Book("Data Structures", "Mark Allen", 102);

        // Display details
        b1.displayBook();
        b2.displayBook();

        // Issue and return operations
        b1.issueBook();
        b1.issueBook(); // already issued

        b1.returnBook();
        b1.returnBook(); // already returned

        // Modify title using setter
        b2.setTitle("Advanced Data Structures");

        // Display updated details
        b2.displayBook();
    }
}