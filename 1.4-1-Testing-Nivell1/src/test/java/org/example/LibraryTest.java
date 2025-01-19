package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library libraryTest;

    @BeforeEach
    void setup() {
        Library libraryTest = new Library();

        libraryTest.addBook(new Book("1984", "George Orwell", 1949));
        libraryTest.addBook(new Book("Brave New World", "Aldous Huxley", 1932));
        libraryTest.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
    }

    @Test
    void testLibraryNotNull() {
        assertNotNull(libraryTest.getLibrary(), "The ArrayList should be not null upon adding one book");
    }

    @Test
    void testSizeOfLibrary() {
        assertEquals(3, libraryTest.getLibrary().size(), "Size of the library should be 3");
    }

    @Test
    void fullCatalog() {



    }

    @Test
    void testBookByPosition() {

        libraryTest.getBookByPosition(0);
        assertEquals("1984", libraryTest.getBookByPosition(0), "Name of the book should be \"1984\"");

        libraryTest.getBookByPosition(2);
        assertEquals("Pride and Prejudice", libraryTest.getBookByPosition(2), "Name of the book should be \"Pride and Prejudice\"");
    }

    @Test
    void addBookByPosition() {
    }

    @Test
    void deleteBookByTitle() {
    }
}