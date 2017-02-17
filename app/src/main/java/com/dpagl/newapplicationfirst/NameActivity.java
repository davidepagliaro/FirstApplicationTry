package com.dpagl.newapplicationfirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by dpagl on 17/02/2017.
 */

public class NameActivity extends Activity{
    TextView name;
    UtentiAdapter u=UtentiAdapter.getUtentiAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        name=(TextView)findViewById(R.id.name_nametxt);
        name.setText(u.getUtente(u.getUtente());

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_name);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
