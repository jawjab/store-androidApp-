package com.joj.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    private Button login;
    private TextView signup;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        actionListener();
    }

    public void initComponent() {
        this.user = (EditText) findViewById(R.id.textUser);
        this.pass = (EditText) findViewById(R.id.textPass);
        this.login = (Button) findViewById(R.id.btnLogin);
        this.signup = (TextView) findViewById(R.id.texSignup);
    }

    public void actionListener() {
        this.login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent = new Intent(Main.this, Store.class);
                        startActivity(intent);
                        finish();
                    }
                }
        );
        this.signup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent = new Intent(Main.this, SignUp.class);
                        startActivity(intent);
                        finish();
                    }
                }
        );

    }


}
