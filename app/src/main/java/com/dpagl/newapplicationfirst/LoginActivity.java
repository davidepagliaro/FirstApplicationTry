package com.dpagl.newapplicationfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by dpagl on 10/02/2017.
 */

public class LoginActivity extends Activity {

    EditText usernameET;
    EditText passwordET;
    LinearLayout loginBT;
    LinearLayout registerBT;

    UtentiAdapter utentiAdapter=UtentiAdapter.getUtentiAdapter();

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate");
        registerBT=(LinearLayout)findViewById(R.id.login_buttonregister);
        loginBT = (LinearLayout) findViewById(R.id.login_button);
        loginBT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                usernameET = (EditText) findViewById(R.id.login_email);
                passwordET = (EditText) findViewById(R.id.login_password);
                if (utentiAdapter.loginControl(usernameET.getText().toString(), passwordET.getText().toString())){
                    Toast.makeText(LoginActivity.this, getString(R.string.login), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("email",usernameET.getText().toString());
                    intent.putExtra("age",1);
                    startActivity(intent);

                } else {

                    Toast.makeText(LoginActivity.this, "e-mail o password errate", Toast.LENGTH_SHORT).show();
                }

            }
        });
        registerBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}
