package com.example.karate.service;

import com.example.karate.entity.KaratePlayer;
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

    public List<KaratePlayer> getAllKaratePlayers() {
        return karatePlayerRepository.findAll();
    }

    public KaratePlayer getKaratePlayer(long karatePlayerId) {
        Optional<KaratePlayer> byId = karatePlayerRepository.findById(karatePlayerId);
        return byId.get();
    }

    public KaratePlayer addNewKaratePlayer(KaratePlayer karatePlayer) {
        return karatePlayerRepository.save(karatePlayer);
    }

    public KaratePlayer updateKaratePlayer(Long karatePlayerId, KaratePlayer karatePlayer) throws Exception {
        karatePlayerRepository.findById(karatePlayerId).orElseThrow(() -> new Exception("Player not found with id : " + karatePlayerId));
        return karatePlayerRepository.save(karatePlayer);
    }

    @Override
    public void deleteKaratePlayer(Long karatePlayerId) throws Exception {
        karatePlayerRepository.findById(karatePlayerId).orElseThrow(() -> new Exception("Player not found with id : " + karatePlayerId));
        karatePlayerRepository.deleteById(karatePlayerId);
    }

}
