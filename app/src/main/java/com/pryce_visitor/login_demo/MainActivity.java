package com.pryce_visitor.login_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_login,btn_signup;
    EditText edt_email,edt_pass;
    TextView txtval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_email= findViewById(R.id.edit_email);
        edt_pass= findViewById(R.id.edit_password);

        btn_login= findViewById(R.id.btn_login);
        btn_signup= findViewById(R.id.btn_signup);

        txtval= findViewById(R.id.txt_value);

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);


        SharedPreferences preferences = getSharedPreferences("UserData", 0);
       String name = preferences.getString("name",null);
       String email = preferences.getString("email",null);

       if(name!=null && email!=null)
       {
           Intent toprofile= new Intent(getApplicationContext(),ProfileScreen.class);
           startActivity(toprofile);
       }





    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.btn_login:

                loginoperation();
                break;
            case R.id.btn_signup:

                movescreen();
                //Toast.makeText(getApplicationContext(),"Signup",Toast.LENGTH_LONG).show();
                break;
        }
    }

    private void movescreen() {

        Intent intent= new Intent(getApplicationContext(),SignupScreen.class);
        startActivity(intent);
        finish();
    }

    private void loginoperation() {
        String value= edt_email.getText().toString();
        txtval.setText(value);
        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
    }
}
