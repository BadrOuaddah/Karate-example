package com.example.player.controller;

import com.example.player.entity.Player;
import com.example.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAllPlayers() {
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping(path = "/{playerId}")
    public ResponseEntity<Player> findPlayerById(@PathVariable long playerId) throws Exception {
        return new ResponseEntity<>(playerService.getPlayer(playerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Player> addNewPlayer(@RequestBody Player player) {
        return new ResponseEntity<>(playerService.addNewPlayer(player), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{playerId}")
    public void deletePlayer(@PathVariable("playerId") Long playerId) throws Exception {
        playerService.deletePlayer(playerId);
    }

    @PutMapping(path = "/{playerId}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long playerId, @RequestBody Player player) throws Exception {
        return new ResponseEntity<>(playerService.updatePlayer(playerId, player), HttpStatus.OK);
    }
}
