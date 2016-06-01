package com.joj.app;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    private EditText fillUser;
    private EditText fillPass;
    private EditText fillPassAgain;
    private CheckBox agree;
    private Button signup;
    private Intent intent;
    private AlertDialog.Builder dialog;
    private boolean checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initComponent();
        actionListener();
    }

    public void initComponent() {
        this.fillUser = (EditText) findViewById(R.id.textFillUser);
        this.fillPass = (EditText) findViewById(R.id.textFillPass);
        this.fillPassAgain = (EditText) findViewById(R.id.textFillPassAgain);
        this.agree = (CheckBox) findViewById(R.id.checkBox);
        this.signup = (Button) findViewById(R.id.btnSignup);
        this.dialog = new AlertDialog.Builder(this);
    }

    public void actionListener() {
        this.agree.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkbox = true;
                    }
                }
        );
        this.signup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isAgree()) {
                            intent = new Intent(SignUp.this, Store.class);
                            startActivity(intent);
                            finish();
                        }
                        else{
                            showDialog();
                        }
                    }
                }
        );

    }

    public boolean isAgree() {
        if (checkbox) {
            return true;
        } else {
            return false;
        }
    }

    public void showDialog(){
        dialog.setMessage("YOU MUST AGREE BEFORE SIGN UP");
        dialog.show();
    }


}