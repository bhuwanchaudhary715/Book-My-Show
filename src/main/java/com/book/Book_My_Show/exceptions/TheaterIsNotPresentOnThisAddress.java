package com.book.Book_My_Show.exceptions;

public class TheaterIsNotPresentOnThisAddress extends RuntimeException{

    public TheaterIsNotPresentOnThisAddress() {
        super("Theater is not present in this address");
    }
}
