package com.book.Book_My_Show.exceptions;

public class UserAlreadyExistsWithEmail extends RuntimeException {

    public UserAlreadyExistsWithEmail() {
        super("User Already Exists with this EmailId");
    }
}
