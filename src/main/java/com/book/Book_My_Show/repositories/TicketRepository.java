package com.book.Book_My_Show.repositories;


import com.book.Book_My_Show.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
