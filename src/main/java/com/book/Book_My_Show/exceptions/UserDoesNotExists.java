package com.book.Book_My_Show.exceptions;

public class UserDoesNotExists extends RuntimeException{

    public UserDoesNotExists() {
        super("User does not exists");
    }
}
