package com.example.JwtDemo.DTO;

public class RegisterRequestDto {

    private String username;
    private String email;
    private String password;

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;  // ✅ assign to field
    }

    public void setEmail(String email) {
        this.email = email;        // ✅ assign to field
    }

    public void setPassword(String password) {
        this.password = password;  // ✅ assign to field
    }
}
