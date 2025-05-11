package com.example.sharedpreferences;

public interface Storage<T> {
    <KEVIN> void  setValue(KEVIN value, String key) throws StorageException;
    <KEVIN> KEVIN getValue(String key, KEVIN opcional);
}
