// sources : https://gist.github.com/AndreiD/960c171c5c5137e95dde#file-android_view_pager

package com.test.testy2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName, password;
    //Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml weird part for password hint font
        EditText password = (EditText) findViewById(R.id.passwordText);
        password.setTypeface(Typeface.DEFAULT);
        password.setTransformationMethod(new PasswordTransformationMethod());

        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final Button registerLink = (Button) findViewById(R.id.bRegisterInit);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);

            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainContentIntent = new Intent(MainActivity.this, MainActivityContent.class);
                MainActivity.this.startActivity(mainContentIntent);

            }
        });

                //userName = (EditText) findViewById(R.id.emailText);
                //password = (EditText) findViewById(R.id.passwordText);
                //clk = (Button) findViewById(R.id.loginButton);
    }


   /* public void movePage(View v) {

        String mUserName = userName.getText().toString();
        String mPassWord = password.getText().toString();

        if (mUserName.equals("Harris") && mPassWord.equals("Lao")) {
            Intent in = new Intent(MainActivity.this, MainActivityContent.class);
            startActivity(in);
        }

        else if (mUserName.equals("") || mPassWord.equals("")) {
            Toast.makeText(getBaseContext(), "Enter email and password", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(getBaseContext(), "Wrong email and password", Toast.LENGTH_SHORT).show();
        }

    }*/
}
