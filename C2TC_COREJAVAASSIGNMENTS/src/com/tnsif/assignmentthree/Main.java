package com.tnsif.assignmentthree;

public class Main {
    public static void main(String[] args) {
        // Inheritance demo
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        book.displayInfo();
        magazine.displayInfo();

        // Composition demo
        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);

        library.showAllItems();
    }
}