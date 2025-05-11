package com.example.a21abril;


import java.util.Date;

public class Authenticator {

    private static Authenticator instance = null;

    private Authenticator() {}

    public static Authenticator getInstance()
        {
        if (instance == null) {
            instance = new Authenticator();
        }
        return instance;
        }
    public Boolean isLogged(Usuario usuario){
        if ()

        return usuario.authtoken.isExpired();
    }

    public void logIn(Usuario usuario)
    {
        String id = String.valueOf(new Random().nextLong());
        Date expiration = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24);
        usuario.setAuthToken(new AuthToken(id, expiration));

        return usuario;
    }
    public void logOut(Usuario usuario)
    {
        usuario.setAuthToken(null);
    }
}
