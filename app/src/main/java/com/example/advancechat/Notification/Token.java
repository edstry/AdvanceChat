package com.example.advancechat.Notification;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;


public class Token {
    private String token;

    public Token(String token) {
        this.token = token;
    }

    public Token() {

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
