package com.example.restsimple.repository;

import com.example.restsimple.model.StreckeRepository; // Ändern Sie den Klassennamen entsprechend
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StreckeRepository extends JpaRepository<Strecke, Long> {
    @Query("SELECT s FROM Strecke s WHERE s.id = :id")
    Optional<Strecke> findByIdColumn(@Param("id") Long id);

    @Query("DELETE FROM Strecke s WHERE s.id = :id")
    @Modifying
    void deleteByIdColumn(@Param("id") Long id);
}