package com.example.player.service;

import com.example.player.entity.Player;

import java.util.List;

public interface ServiceImplementation {

    List<Player> getAllPlayers();

    Player getPlayer(long playerId);

    Player addNewPlayer(Player player);

    Player updatePlayer(Long playerId, Player player) throws Exception;

    void deletePlayer(Long playerId) throws Exception;
}
