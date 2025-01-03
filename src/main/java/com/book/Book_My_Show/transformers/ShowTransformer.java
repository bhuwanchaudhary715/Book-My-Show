package com.book.Book_My_Show.transformers;


import com.book.Book_My_Show.dtos.RequestDtos.ShowEntryDto;
import com.book.Book_My_Show.models.Show;

public class ShowTransformer {

    public static Show showDtoToShow(ShowEntryDto showEntryDto) {
        Show show = Show.builder()
                .time(showEntryDto.getShowStartTime())
                .date(showEntryDto.getShowDate())
                .build();

        return show;
    }
}
