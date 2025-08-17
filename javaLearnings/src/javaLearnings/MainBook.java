package javaLearnings;

class Library {
    void addBook(Book b) {
        System.out.println("Book added: " + b.title + " by " + b.author);
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;

        // Pass current object (Book) to Library
        Library lib = new Library();
        lib.addBook(this);  
    }
}

public class MainBook {
    public static void main(String[] args) {
        // When we create a Book, it passes itself to Library
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
    }
}
