package com.dpagl.newapplicationfirst;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by dpagl on 08/02/2017.
 */

public class MainActivity extends Activity {

    Intent intent;
    String email = "";
    static LinearLayout layout;


    // recyclerView items
    RecyclerView businessCardsRV;
    LinearLayoutManager layoutManager;
    UtentiAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.main_activityLy);
        intent = getIntent();
        businessCardsRV = (RecyclerView) findViewById(R.id.main_recycler);
        layoutManager = new LinearLayoutManager(this);
        adapter = UtentiAdapter.getUtentiAdapter();
        businessCardsRV.setLayoutManager(layoutManager);
        businessCardsRV.setAdapter(adapter);
    }



    @Override
    protected void onStart() {
        super.onStart();
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
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }



}
