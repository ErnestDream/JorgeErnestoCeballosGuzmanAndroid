package com.example.basededatos;

import android.os.AsyncTask;
import android.os.Build;

import androidx.room.Room;

import java.util.Random;

public class Repositorio {

    static String databaseName = "database.zeus";
    private DatabaseOperation handler;

    private AppDatabase db;

    public Repositorio(DatabaseOperation handler)
    {
        this.handler = handler;
        AsyncTask.execute(() -> {
            this.db = Room.databaseBuilder();
            AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, databaseName).build();
        }
    interface DatabaseOperation{
        void onSave(User user);
        void onDelete();
        void onList(List<User> users);
    }

    public void listUsers(){

        AsyncTask.execute(() -> {

                    UserDAo userDAo = db.userDao();
                    List<User> lista = userDao.getAll();

                    return handler.onList(users);
        });
    }


    public createUser(User user)
    {

        AsyncTask.execute(() -> {
            UserDAo userDAo = db.userDao();
            userDao.insert(user);
            return handler.onSaved(users);
        });
    }

    public createUser(User user){

            AsyncTask.execute(() -> {
                UserDAo userDAo = db.userDao();
                userDao.insert(user);
                return handler.onSaved(users);
            });
        }
}
