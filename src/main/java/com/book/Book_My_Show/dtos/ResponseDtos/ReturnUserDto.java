package com.book.Book_My_Show.dtos.ResponseDtos;


import com.book.Book_My_Show.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReturnUserDto {

    private String name;
    private Integer age;
    private Gender gender;
    private String address;
}
