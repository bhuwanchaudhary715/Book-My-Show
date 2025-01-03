package com.book.Book_My_Show.dtos.RequestDtos;


import com.book.Book_My_Show.enums.Gender;
import lombok.Data;

@Data
public class UserEntryDto {

    private String name;
    private Integer age;
    private String address;
    private String mobileNo;
    private String emailId;
    private Gender gender;
}
