package com.example.karate.service;

import com.example.karate.entity.KaratePlayer;

import java.util.List;

public interface ServiceImplementation {

    List<KaratePlayer> getAllKaratePlayers();

    KaratePlayer getKaratePlayer(long karatePlayerId);

    KaratePlayer addNewKaratePlayer(KaratePlayer karatePlayer);

    KaratePlayer updateKaratePlayer(Long karatePlayerId, KaratePlayer karatePlayer) throws Exception;

    void deleteKaratePlayer(Long karatePlayerId) throws Exception;
}
