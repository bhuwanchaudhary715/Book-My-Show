package com.book.Book_My_Show.exceptions;

public class TheaterIsPresentOnThatAddress extends RuntimeException{

    public TheaterIsPresentOnThatAddress() {
        super("Theater is already Present on this Address");
    }
}
