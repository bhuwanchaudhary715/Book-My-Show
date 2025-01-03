package com.book.Book_My_Show.exceptions;

public class MovieAlreadyPresentWithSameNameAndLanguage extends RuntimeException {

    public MovieAlreadyPresentWithSameNameAndLanguage() {
        super("Movie is already exists with same name and language");
    }
}
