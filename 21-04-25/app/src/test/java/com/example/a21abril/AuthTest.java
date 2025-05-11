package com.example.a21abril;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.Random;

public class AuthTest {

    static Usuario create (){
        Random random = new Random();
        String id = String.valueOf(random.nextLong());
        String id2 = String.valueOf(random.nextLong());
        Date exp = new Date();
        AuthToken token = new AuthToken(id2, exp);
        Usuario usuario = new Usuario(id, "Mario", "hola@gmail.com", token);
        return new Usuario(id, "Mario", "hola@gmail.com", token);
    }

    @Test
    public void testUser()
    {
        Random random = new Random();
        String id = String.valueOf(random.nextLong());
        String id2 = String.valueOf(random.nextLong());
        Date exp = new Date();
        AuthToken token = new AuthToken(id2, exp);
        Usuario usuario = new Usuario(id, "Mario", "hola@gmail.com", token);

        Assert.assertEquals(usuario.getNombre(), "Mario");
        Assert.assertEquals(usuario.getEmail(), "hola@gmail.com");
        Assert.assertNull(usuario.authtoken);
    }

    @Test
    public void testTokenExpired() {

        Usuario usuario = AuthTest.create();
        Date expiration = new Date(System.currentTimeMillis() - 10);
        AuthToken token = new AuthToken(new Random().nextLong(), expiration);
        usuario.setAuthToken();
        Boolean isLogged = Authenticator.getInstance().isLogged(usuario);
        Assert.assertFalse(isLogged);


    }

    @Test
    public void testTokenNotExpired() {
        Usuario usuario = AuthTest.create();
        Authenticator.getInstance().logIn(usuario);
        Date date = new Date();
        Assert.assertNotNull(usuario.authtoken);
    }

    @Test
    public void testTokenSuccess() {
        Usuario usuario = AuthTest.create();
        Authenticator.getInstance().logIn(usuario);
        Assert.assertNotNull(usuario.authtoken);
    }

    @Test
    public void testUserIsLogged() {

        Usuario usuario = AuthTest.create();
        Authenticator.getInstance().logIn(usuario);
        Assert.assertTrue(Authenticator.getInstance().isLogged(usuario));
    }

    @Test
    public void testUserIsNotLogged() {
        Usuario usuario = AuthTest.create();
        Assert.assertFalse(Authenticator.getInstance().isLogged(usuario));

    }
}
