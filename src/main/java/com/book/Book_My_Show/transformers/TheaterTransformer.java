package com.book.Book_My_Show.transformers;


import com.book.Book_My_Show.dtos.RequestDtos.TheaterEntryDto;
import com.book.Book_My_Show.models.Theater;

public class TheaterTransformer {

    public static Theater theaterDtoToTheater(TheaterEntryDto entryDto) {
        Theater theater = Theater.builder()
                .name(entryDto.getName())
                .address(entryDto.getAddress())
                .build();
        return theater;
    }
}
