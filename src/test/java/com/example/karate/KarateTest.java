package com.example.karate;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FistTest.feature", plugin = {"pretty","html:target/report.html"})
public class KarateTest {
}
