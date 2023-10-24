package com.example.restsimple.repository;

import com.example.restsimple.model.BahnhofStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BahnhofStationRepository extends JpaRepository<BahnhofStation, Long> {
    @Query("SELECT b FROM BahnhofStation b WHERE b.id = :id")
    Optional<BahnhofStation> findByIdColumn(@Param("id") Long id);

    @Query("DELETE FROM BahnhofStation b WHERE b.id = :id")
    @Modifying
    void deleteByIdColumn(@Param("id") Long id);
}