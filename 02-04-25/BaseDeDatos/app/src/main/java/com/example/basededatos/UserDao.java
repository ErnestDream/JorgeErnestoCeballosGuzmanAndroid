package com.example.basededatos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE phone = (:phone)")
    List<User> selectByPhone(String Phone);

    @Insert
    void insert(User users);

    @Delete
    void delete(User user);
}