package com.base256.spamreaper.apps.accounts;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// Maps to the `users` table (V2__accounts.sql). One row per account —
// local email + password login only for now; OAuth-based mailbox
// connections (Gmail/Microsoft/Apple) live in a separate table (step 5)
// and are NOT how a person logs into Spam Reaper itself.
//
// MFA and refresh-token columns are added by a later migration (step 4b)
// and will land as new fields here then — deliberately absent now.
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String username;

    @Column(nullable = false, unique = true, length = 255)
    private String email;




}
