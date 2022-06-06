package com.example.lagccalumni;

import java.util.ArrayList;

public class userViewModel {
    private ArrayList<user> users;
    private static userViewModel instance;

    public static userViewModel getInstance() {
        if (instance == null) {
            instance = new userViewModel();
        }
        return instance;
    }

    public userViewModel() {
        this.users = new ArrayList<>();
    }

    public void addUser(user user) {
        users.add(user);
    }

    public ArrayList<user> getUsers() {
        return users;
    }
}
