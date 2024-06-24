package com.example.karate.controller;

import com.example.karate.entity.Player;
import com.example.karate.service.KaratePlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/karatePlayers")
public class KaratePlayerController {

    private final KaratePlayerService karatePlayerService;

    @Autowired
    public KaratePlayerController(KaratePlayerService karatePlayerService) {
        this.karatePlayerService = karatePlayerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAllPlayers() {
        return new ResponseEntity<>(karatePlayerService.getAllKaratePlayers(), HttpStatus.OK);
    }

    @GetMapping(path = "/{karatePlayerId}")
    public ResponseEntity<Player> findKaratePlayerById(@PathVariable long karatePlayerId) throws Exception {
        return new ResponseEntity<>(karatePlayerService.getKaratePlayer(karatePlayerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Player> addNewKaratePlayer(@RequestBody Player karatePlayer) {
        return new ResponseEntity<>(karatePlayerService.addNewKaratePlayer(karatePlayer), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{karatePlayerId}")
    public void deleteKaratePlayer(@PathVariable("karatePlayerId") Long karatePlayerId) throws Exception {
        karatePlayerService.deleteKaratePlayer(karatePlayerId);
    }

    @PutMapping(path = "/{karatePlayerId}")
    public ResponseEntity<Player> updateKaratePlayer(@PathVariable Long karatePlayerId, @RequestBody Player karatePlayer) throws Exception {
        return new ResponseEntity<>(karatePlayerService.updateKaratePlayer(karatePlayerId, karatePlayer), HttpStatus.OK);
    }
}
