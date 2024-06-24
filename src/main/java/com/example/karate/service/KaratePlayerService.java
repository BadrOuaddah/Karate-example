package com.example.karate.service;

import com.example.karate.entity.Player;
import com.example.karate.repository.KaratePlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KaratePlayerService implements ServiceImplementation {

    private final KaratePlayerRepository karatePlayerRepository;

    public KaratePlayerService(KaratePlayerRepository karatePlayerRepository) {
        this.karatePlayerRepository = karatePlayerRepository;
    }

    public List<Player> getAllKaratePlayers() {
        return karatePlayerRepository.findAll();
    }

    public Player getKaratePlayer(long karatePlayerId) {
        Optional<Player> byId = karatePlayerRepository.findById(karatePlayerId);
        return byId.get();
    }

    public Player addNewKaratePlayer(Player karatePlayer) {
        return karatePlayerRepository.save(karatePlayer);
    }

    public Player updateKaratePlayer(Long karatePlayerId, Player karatePlayer) throws Exception {
        karatePlayerRepository.findById(karatePlayerId).orElseThrow(() -> new Exception("Player not found with id : " + karatePlayerId));
        return karatePlayerRepository.save(karatePlayer);
    }

    @Override
    public void deleteKaratePlayer(Long karatePlayerId) throws Exception {
        karatePlayerRepository.findById(karatePlayerId).orElseThrow(() -> new Exception("Player not found with id : " + karatePlayerId));
        karatePlayerRepository.deleteById(karatePlayerId);
    }

}
