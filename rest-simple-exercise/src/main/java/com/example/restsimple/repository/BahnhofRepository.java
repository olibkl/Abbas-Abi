package com.example.restsimple.repository;

import com.example.restsimple.model.Bahnhof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BahnhofRepository extends JpaRepository<Bahnhof, Long> {
    @Query("SELECT b FROM Bahnhof b WHERE b.id = :id")
    Optional<Bahnhof> findByIdColumn(@Param("id") Long id);

    @Query("DELETE FROM Bahnhof b WHERE b.id = :id")
    @Modifying
    void deleteByIdColumn(@Param("id") Long id);
}