package com.book.Book_My_Show.transformers;


import com.book.Book_My_Show.dtos.RequestDtos.UserEntryDto;
import com.book.Book_My_Show.dtos.ResponseDtos.ReturnUserDto;
import com.book.Book_My_Show.models.User;

public class UserTransformer {

    public static User userDtoToUser(UserEntryDto userEntryDto) {
        User user = User.builder()
                .name(userEntryDto.getName())
                .age(userEntryDto.getAge())
                .address(userEntryDto.getAddress())
                .gender(userEntryDto.getGender())
                .mobileNo(userEntryDto.getMobileNo())
                .emailId(userEntryDto.getEmailId())
                .build();

        return user;
    }

    public static ReturnUserDto userToUserDto(User user) {
        ReturnUserDto userDto = ReturnUserDto.builder()
                .name(user.getName())
                .age(user.getAge())
                .address(user.getAddress())
                .gender(user.getGender())
                .build();

        return userDto;
    }
}
