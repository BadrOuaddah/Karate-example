package com.example.player.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "players")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String fullName;
    int age;
    String beltColor;
}


