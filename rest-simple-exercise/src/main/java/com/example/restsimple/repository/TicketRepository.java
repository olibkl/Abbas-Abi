package com.example.restsimple.repository;

import com.example.restsimple.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Query("SELECT t FROM Ticket t WHERE t.id = :id")
    Optional<Ticket> findByIdColumn(@Param("id") Long id);

    @Query("DELETE FROM Ticket t WHERE t.id = :id")
    @Modifying
    void deleteByIdColumn(@Param("id") Long id);
}