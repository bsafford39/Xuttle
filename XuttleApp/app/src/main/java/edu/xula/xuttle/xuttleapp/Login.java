package edu.xula.xuttle.xuttleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Brittany on 10/1/2016.
 */

public class Login extends Activity{
    private EditText mEtEmail;
    private EditText mEtPassword;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        mEtEmail = (EditText) findViewById(R.id.et_login_email);
        mEtPassword = (EditText) findViewById(R.id.et_login_password);
        mLoginButton = (Button) findViewById(R.id.login_button);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadPickupScreen(v);
            }
        });

    }

    public void loadPickupScreen(View v){
        startActivity(new Intent(Login.this, PickUp.class));
    }

}