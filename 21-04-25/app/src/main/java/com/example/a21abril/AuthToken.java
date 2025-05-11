package com.example.a21abril;

import java.util.Date;

public class AuthToken {
    String id;
    Date expiration;

    public AuthToken(String id, Date expiration) {
        this.id = id;
        this.expiration = expiration;
    }


}
