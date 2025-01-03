package com.book.Book_My_Show.exceptions;

public class TheaterDoesNotExists extends RuntimeException{

    public TheaterDoesNotExists() {
        super("Theater does not Exists");
    }
}
