package com.vero.petagram;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
      /*  actionBarAtras();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void actionBarAtras(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            getSupportActionBar().setIcon(R.drawable.pawfootprint_48);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("New ActionBar");
        }
    }*/

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // getSupportActionBar().setIcon(R.drawable.pawfootprint_48);



    }
}

