package com.base256.spamreaper.apps.accounts;

// Every user has exactly one role. It is stored as the enum name (a
// string) in users.role and travels into Spring Security as the
// authority "ROLE_USER" / "ROLE_ADMIN" (see CustomUserDetailsService).
//
//   USER — a normal account: connects mailboxes, runs scans, unsubscribes.
//   ADMIN — Base 256 operator: user management, support, system status.
//
// Add new roles by appending to this list. Never reorder or rename an
// existing constant — the name is what's persisted in the database.

public enum Role {
    USER,
    ADMIN
}
