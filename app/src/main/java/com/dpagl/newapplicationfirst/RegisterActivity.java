package com.dpagl.newapplicationfirst;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by dpagl on 10/02/2017.
 */

public class RegisterActivity extends Activity implements View.OnClickListener{
    EditText email;
    EditText cell;
    EditText indirizzo;
    EditText password;
    Button btn;
    ListLogin a = ListLogin.getIstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email= (EditText)findViewById(R.id.register_emailET);
        cell= (EditText)findViewById(R.id.register_cellET);
        indirizzo= (EditText)findViewById(R.id.register_indET);
        password= (EditText)findViewById(R.id.register_pasET);
        btn=(Button)findViewById(R.id.register_button);
        btn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void onClick(View v) {
        Utenti u=new Utenti(email.getText().toString(),cell.getText().toString(),indirizzo.getText().toString(),password.getText().toString());
        a.setList(u);
        Toast.makeText(RegisterActivity.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);

    }
}
