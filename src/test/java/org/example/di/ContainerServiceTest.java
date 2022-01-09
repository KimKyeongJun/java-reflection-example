package org.example.di;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerServiceTest {

    @Test
    public void getObject_BookRepository() {
        BookRepository bookRepository = ContainerService.getObjct(BookRepository.class);
        assertNotNull(bookRepository);
    }

    @Test
    public void getObject_BookService() {
        BookService bookService = ContainerService.getObjct(BookService.class);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }

}