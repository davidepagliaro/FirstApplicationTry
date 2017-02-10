package com.dpagl.newapplicationfirst;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by dpagl on 08/02/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener{
    TextView viatxt;
    TextView teltxt;
    Button call;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=(Button)findViewById(R.id.main_callBT);
        go=(Button)findViewById(R.id.main_goBT);
        call.setOnClickListener(this);
        go.setOnClickListener(this);
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


    @Override
    public void onClick(View v) {
        viatxt=(TextView)findViewById(R.id.main_viewtxt);
        teltxt=(TextView)findViewById(R.id.main_teltxt);
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        if(v.getId()==call.getId()){
            Uri uri=Uri.parse("tel:"+teltxt.getText().toString());
            intent.setData(uri);
            startActivity(intent);
        }else{
            Uri uri = Uri.parse("geo:0,0?q="+viatxt.getText().toString());
            intent.setData(uri);
            startActivity(intent);
        }


    }
}
