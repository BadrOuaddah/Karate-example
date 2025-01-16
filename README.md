# Karate-example 🥋

- This is a simple Spring Framework 🍃 app example built with Java ☕, using the Cucumber testing tool and the Karate test runner.
- The application is based on the MVC (Model-View-Controller) architecture with one entity: Player.
- This application is connected to an in-memory database: H2 Database.
- In the testing section, we use the Karate runner to test all scenarios in the test.feature file.

## Tools and dependencies
```c
- Java 17
- Spring boot 3.3.0
- h2database
- lombok 1.18.32
- cucumber-java 1.2.0
- cucumber-junit 7.10.1
- karate-junit5 1.4.1
```

## How Does It Work ?

- Create a feature file to write scenarios: karate/test.feature
- Create a Karate runner class to run integration tests in the Spring Boot environment
```java

@SpringBootTest(classes = {PlayerApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class KarateRunnerTest {

    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:karate/test.feature");

    }

}

```
- Run KarateRunnerTest and view the results in the output :

![image](https://github.com/user-attachments/assets/145c319e-e9f4-428a-afe8-4b5d3b78c98e)

- Click the HTML link to view the code coverage report for the Karate tests :

  ![image](https://github.com/user-attachments/assets/2382c1f0-ef28-4b84-8c04-15e69dc83cf2)

  ![image](https://github.com/user-attachments/assets/c4512018-afe4-4f37-8876-d57bc75e806d)


