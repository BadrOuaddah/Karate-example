package com.example.karate.repository;

import com.example.karate.entity.KaratePlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaratePlayerRepository extends JpaRepository<KaratePlayer, Long> {
}
