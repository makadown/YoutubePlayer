package com.makadown.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlaySingleVideo;
    Button btnStandAlone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlaySingleVideo = (Button) findViewById(R.id.btnPlaySingleVideo);
        btnStandAlone      = (Button) findViewById(R.id.btnStandalone );
        btnPlaySingleVideo.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


    }

    @Override
    public void onClick(View v)
    {
        Intent intent = null;
        switch(v.getId())
        {
            case  R.id.btnPlaySingleVideo :
                intent = new Intent(MainActivity.this, YoutubeActivity.class);
                break;
            case  R.id.btnStandalone :
                intent = new Intent(MainActivity.this, StandAloneActivity.class);
                break;
            default:

        }

        if( intent != null)
        {
            startActivity(intent);
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
