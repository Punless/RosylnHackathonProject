package com.example.rosylnhackathonproject;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class User {
    private static FirebaseUser user;
    private final static FirebaseDatabase data = FirebaseDatabase.getInstance();

    public static void changeUser(FirebaseUser myUser){
        user = myUser;
    }
    public static String getId(){

        return user.getUid().toString();
    }
    public static void setMadLib(String madlib){
        DatabaseReference ref = data.getReference("Users/"+getId()+"/Madlib");
        ref.setValue(madlib);

    }
    public static Task<DataSnapshot> findMadLib()
    {
        DatabaseReference ref = data.getReference("Users/"+getId()+"/Madlib");
        return ref.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if(task.isSuccessful())
                {

                }
            }
        });
    }
    public static DatabaseReference getRef()
    {
        return data.getReference("Users/"+getId()+"/Madlib");
    }

}
