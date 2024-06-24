package com.example.player;

import com.intuit.karate.junit5.Karate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {PlayerApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class KarateRunnerTest {

    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:karate/test.feature");
    }
}
