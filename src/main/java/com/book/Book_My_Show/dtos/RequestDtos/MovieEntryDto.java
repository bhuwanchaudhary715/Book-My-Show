package com.book.Book_My_Show.dtos.RequestDtos;


import com.book.Book_My_Show.enums.Genre;
import com.book.Book_My_Show.enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieEntryDto {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
