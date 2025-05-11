package com.example.a21abril;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class Usuario {

    private String id;
    private String nombre;
    private String email;
    AuthToken authtoken;

    public Usuario(String id, String nombre, String email, AuthToken authtoken) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.authtoken = authtoken;
    }

    //public Usuario(String id, String nombre, String email, AuthToken authtoken) {
    //    this.id = id;
    //    this.nombre = nombre;
    //    this.email = email;
        //this.authtoken = authtoken;
    //}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAuthToken(@Nullable AuthToken newToken){
        this.authToken = newToken;
    }

    public Boolean isExpired(){
        Date exp = usuario.authtoken.expiration;
        Date now = new Date();
        long diff = exp.getTime() - now.getTime();
        return diff < 0;
    }
}
