package com.book.Book_My_Show.exceptions;

public class RequestedSeatAreNotAvailable extends RuntimeException{

    public RequestedSeatAreNotAvailable() {
        super("Requested Seats Are Not Available");
    }
}
