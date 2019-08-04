package com.pryce_visitor.login_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupScreen extends AppCompatActivity {

    Button btn_signup;

    EditText edt_name,edt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        btn_signup=findViewById(R.id.button);
        edt_name=findViewById(R.id.edt_name);
        edt_email= findViewById(R.id.edt_email);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("UserData", 0);

                SharedPreferences.Editor edt = preferences.edit();


                edt.putString("name",edt_name.getText().toString());
                edt.putString("email",edt_email.getText().toString());


                edt.commit();

               // Intent intent= new Intent(getApplicationContext(),ProfileScreen.class);
              //  startActivity(intent);
            }
        });




    }
}
