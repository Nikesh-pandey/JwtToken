package com.example.JwtDemo.DTO;

public class jwtDto {
    private String message;
    private String jwt;

    public jwtDto(String message, String jwt) {
        this.message = message;
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public String getMessage() {
        return message;
    }
}
