package com.example.model;

public class UserPreference {
    private String userId;
    private String preference;

    public UserPreference() {}

    public UserPreference(String userId, String preference) {
        this.userId = userId;
        this.preference = preference;
    }

    public String getUserId() {
        return userId;
    }

    public String getPreference() {
        return preference;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}