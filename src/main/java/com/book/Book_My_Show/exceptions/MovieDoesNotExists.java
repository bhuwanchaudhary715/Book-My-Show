package com.book.Book_My_Show.exceptions;

public class MovieDoesNotExists extends RuntimeException{

    public MovieDoesNotExists() {
        super("Movie dose not Exists");
    }
}
