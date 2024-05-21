package com.br.spotify.controller;

import com.br.spotify.client.AuthSpotifyClient;
import com.br.spotify.client.GoogleClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api/")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok(authSpotifyClient.login());
    }

}
