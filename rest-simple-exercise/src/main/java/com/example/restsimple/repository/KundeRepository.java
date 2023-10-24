package com.example.restsimple.repository;

import com.example.restsimple.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface KundeRepository extends JpaRepository<Kunde, Long> {
    @Query("SELECT k FROM Kunde k WHERE k.id = :id")
    Optional<Kunde> findByIdColumn(@Param("id") Long id);

    @Query("DELETE FROM Kunde k WHERE k.id = :id")
    @Modifying
    void deleteByIdColumn(@Param("id") Long id);
}