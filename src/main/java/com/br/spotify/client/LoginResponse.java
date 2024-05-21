package com.br.spotify.client;

public class LoginResponse {

    private String accessToken;

    public LoginResponse(String accessToken) {
        this.accessToken = accessToken;
    }

    public LoginResponse() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
