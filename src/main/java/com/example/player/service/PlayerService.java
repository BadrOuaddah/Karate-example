package com.example.player.service;

import com.example.player.entity.Player;
import com.example.player.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService implements ServiceImplementation {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayer(long playerId) {
        Optional<Player> byId = playerRepository.findById(playerId);
        return byId.get();
    }

    public Player addNewPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long playerId, Player player) throws Exception {
        playerRepository.findById(playerId).orElseThrow(() -> new Exception("Player not found with id : " + playerId));
        return playerRepository.save(player);
    }

    public void deletePlayer(Long playerId) throws Exception {
        playerRepository.findById(playerId).orElseThrow(() -> new Exception("Player not found with id : " + playerId));
        playerRepository.deleteById(playerId);
    }

}
