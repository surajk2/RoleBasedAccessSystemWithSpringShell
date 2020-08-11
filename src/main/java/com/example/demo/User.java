package com.example.demo;

import java.util.Objects;

class User {
    private String userName;
    private String userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        int hash = 10;
        hash = 25 * hash + this.userName.hashCode();
        return hash;
    }

    public User(String userName) {
        this.userName = userName;
    }
}
