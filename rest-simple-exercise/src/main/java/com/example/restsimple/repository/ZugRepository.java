package com.example.restsimple.repository;

import com.example.restsimple.model.Zug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ZugRepository extends JpaRepository<Zug, Long> {
    @Query("SELECT z FROM Zug z WHERE z.id = :id")
    Optional<Zug> findByIdColumn(@Param("id") Long id);

    @Query("DELETE FROM Zug z WHERE z.id = :id")
    @Modifying
    void deleteByIdColumn(@Param("id") Long id);
}
