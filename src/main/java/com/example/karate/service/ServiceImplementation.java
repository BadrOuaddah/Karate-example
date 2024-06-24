package com.example.karate.service;

import com.example.karate.entity.Player;

import java.util.List;

public interface ServiceImplementation {

    List<Player> getAllKaratePlayers();

    Player getKaratePlayer(long karatePlayerId);

    Player addNewKaratePlayer(Player karatePlayer);

    Player updateKaratePlayer(Long karatePlayerId, Player karatePlayer) throws Exception;

    void deleteKaratePlayer(Long karatePlayerId) throws Exception;
}
