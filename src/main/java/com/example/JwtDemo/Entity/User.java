package com.example.JwtDemo.Entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "item_table")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username; // This is like a display name/nickname

    @Column(name = "email", nullable = false, unique = true)
    private String email; // This is what we use to log in

    @Column(name = "password", nullable = false)
    private String password;

    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // --- UserDetails Interface Methods ---

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Giving the user a default role so they can actually access pages
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        // Spring Security calls this to get the "Unique Identifier"
        return email;
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }

    // --- Standard Getters and Setters ---

    public Long getId() { return id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }

    // We renamed this getter to avoid clashing with the Security getUsername()
    public String getDisplayName() { return username; }
    public void setUsername(String username) { this.username = username; }
}



// Since I am Using UserDetailsService so this enterface expects UserDetails in return but to I ahve User Entity like to get data from db i have User but this methods returns UserDetails now conflit arise thats why I implements like this public class User implements UserDetails now again UserDetails have so many methods which i override confusion is there