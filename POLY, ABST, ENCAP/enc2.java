class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Already issued");
        }
    }

    public void returnBook() {
        isIssued = false;
        System.out.println("Book returned");
    }

    public void display() {
        System.out.println(title + " by " + author + 
            (isIssued ? " (Issued)" : " (Available)"));
    }
}

public class enc2 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James");
        b.issueBook();
        b.display();
    }
}