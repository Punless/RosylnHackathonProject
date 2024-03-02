package com.example.rosylnhackathonproject;

import com.google.firebase.auth.FirebaseUser;

public class User {
    private static FirebaseUser user;
    public static void changeUser(FirebaseUser myUser){
        user = myUser;
    }
    public static String getId(){

        return user.getUid().toString();
    }

}
