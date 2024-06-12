package com.example.karate.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "karatePlayers")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KaratePlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String fullName;
    int age;
    String beltColor;
}


