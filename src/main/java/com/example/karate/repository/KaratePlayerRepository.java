package com.example.karate.repository;

import com.example.karate.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaratePlayerRepository extends JpaRepository<Player, Long> {
}
