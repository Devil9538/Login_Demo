package com.pryce_visitor.login_demo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileScreen extends AppCompatActivity {


    TextView txt_name,txt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);


        txt_name = findViewById(R.id.txt_name);
        txt_email= findViewById(R.id.txt_email);


        SharedPreferences preferences = getSharedPreferences("UserData", 0);
        String name = preferences.getString("name",null);
        String email = preferences.getString("email",null);

        txt_name.setText(name);
        txt_email.setText(email);

    }
}
