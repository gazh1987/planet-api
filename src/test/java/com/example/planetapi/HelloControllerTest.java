package com.example.planetapi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class HelloControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @ParameterizedTest(name = "GET {0} returns {1}")
    @CsvSource({
        "/helloWorld, Hello World",
        "/helloMercury, Hello Mercury"
        "/helloVenus, Hello Venus",
        "/helloEarth, Hello Earth",
        "/helloMars, Hello Mars",
        "/helloJupiter, Hello Jupiter",
        "/helloSaturn, Hello Saturn",
        "/helloUranus, Hello Uranus",
        "/helloNeptune, Hello Hello",
    })
    void returnsPlainTextGreeting(String path, String greeting) throws Exception {
        mockMvc.perform(get(path))
            .andExpect(status().isOk())
            .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN))
            .andExpect(content().string(greeting));
    }

    @Test
    void unknownRouteReturnsNotFound() throws Exception {
        mockMvc.perform(get("/helloPluto"))
            .andExpect(status().isNotFound());
    }

    @Test
    void postIsNotAllowed() throws Exception {
        mockMvc.perform(post("/helloWorld"))
            .andExpect(status().isMethodNotAllowed());
    }
}