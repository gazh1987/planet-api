# planet-api

A minimal Java 17 Spring Boot REST API using Gradle.

## Build and run

You need JDK 17. The included Gradle wrapper downloads Gradle automatically
on the first run, so you do not need to install Gradle separately.

```bash
cd /Users/garyhealy/CodexProjects/planet-api
./gradlew clean build
java -jar build/libs/planet-api-0.0.1-SNAPSHOT.jar
```

Wait for the application to start, then open any URL below in your browser.
Stop the application with **Ctrl+C** in the terminal.

Alternatively, run directly with Gradle:

```bash
./gradlew bootRun
```

## Run tests

```bash
./gradlew test
```

The controller tests cover all nine greetings, plain-text responses, unknown
routes, and unsupported POST requests without starting the application.
The HTML test report is in `build/reports/tests/test/index.html`.

GitHub Actions runs the tests with Java 17 on every branch push and pull request.
View the results in the repository's **Actions** tab or the pull request checks.
The workflow is defined in `.github/workflows/tests.yml`.

## Endpoints

| Browser URL | Response |
| --- | --- |
| http://localhost:8080/helloWorld | Hello World |
| http://localhost:8080/helloMercury | Hello Mercury |
| http://localhost:8080/helloVenus | Hello Venus |
| http://localhost:8080/helloEarth | Hello Earth |
| http://localhost:8080/helloMars | Hello Mars |
| http://localhost:8080/helloJupiter | Hello Jupiter |
| http://localhost:8080/helloSaturn | Hello Saturn |
| http://localhost:8080/helloUranus | Hello Uranus |
| http://localhost:8080/helloNeptune | Hello Neptune |

All endpoints accept GET requests and return plain text.

## Files to explore

- `build.gradle` defines the dependencies and Gradle build.
- `settings.gradle` sets the project name.
- `PlanetApiApplication.java` starts Spring Boot.
- `HelloController.java` maps each URL to a method returning its greeting.
