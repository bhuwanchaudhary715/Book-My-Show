package com.book.Book_My_Show.services;

import com.book.Book_My_Show.dtos.RequestDtos.UserEntryDto;
import com.book.Book_My_Show.dtos.ResponseDtos.TicketResponseDto;
import com.book.Book_My_Show.exceptions.UserAlreadyExistsWithEmail;
import com.book.Book_My_Show.exceptions.UserDoesNotExists;
import com.book.Book_My_Show.models.Ticket;
import com.book.Book_My_Show.models.User;
import com.book.Book_My_Show.repositories.UserRepository;
import com.book.Book_My_Show.transformers.TicketTransformer;
import com.book.Book_My_Show.transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto) throws UserAlreadyExistsWithEmail {
        if(userRepository.findByEmailId(userEntryDto.getEmailId()) != null) {
            throw new UserAlreadyExistsWithEmail();
        }
        User user = UserTransformer.userDtoToUser(userEntryDto);

        userRepository.save(user);
        return "User Saved Successfully";
    }

    public List<TicketResponseDto> allTickets(Integer userId) throws UserDoesNotExists {
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isEmpty()) {
            throw new UserDoesNotExists();
        }
        User user = userOpt.get();
        List<Ticket> ticketList = user.getTicketList();
        List<TicketResponseDto> ticketResponseDtos = new ArrayList<>();
        for(Ticket ticket : ticketList) {
            TicketResponseDto ticketResponseDto = TicketTransformer.returnTicket(ticket.getShow(), ticket);
            ticketResponseDtos.add(ticketResponseDto);
        }
        return ticketResponseDtos;
    }
}
