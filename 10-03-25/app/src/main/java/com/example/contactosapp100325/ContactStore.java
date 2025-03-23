package com.example.contactosapp100325;

import java.util.ArrayList;
import java.util.List;

//Tiene en memeoria lo del adaptador
public class ContactStore {

    private List<Contact> cache;

    public ContactStore(){
        this.cache = ContactStore.createContacts();
    }

    public List<Contact> getCache() {
        return cache;
    }

    public Contact get(int position){
        return cache.get(position);
    }
    public int size(){
        return cache.size();
    }
    public Contact findContactByPhone(String phoneNumber){
        for (Contact c: cache) {
            if (c.phone.equals(phoneNumber)) {
                return c;
            }
        }
        return null;
    }

    public static List<Contact> createContacts(){
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ariana","1111111"));
        contacts.add(new Contact("Pedro","1111111"));
        contacts.add(new Contact("Lopez","1111111"));
    }

}
