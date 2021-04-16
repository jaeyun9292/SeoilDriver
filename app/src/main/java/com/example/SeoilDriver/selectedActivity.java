package com.example.SeoilDriver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class selectedActivity  extends AppCompatActivity implements View.OnClickListener {



    Button myeonmok1,myeonmok2,mangu1,mangu2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_selected);

        myeonmok1=findViewById(R.id.myeonmok1);
        myeonmok1.setOnClickListener(this);
        myeonmok2=findViewById(R.id.myeonmok2);
        myeonmok2.setOnClickListener(this);
        mangu1=findViewById(R.id.mangu1);
        mangu1.setOnClickListener(this);
        mangu2=findViewById(R.id.mangu2);
        mangu2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.myeonmok1){
            Intent intent01 = new Intent(selectedActivity.this,MapsActivity.class);
            intent01.putExtra("route","myeonmok1");
            startActivity(intent01);
        }
        if(v.getId() == R.id.myeonmok2){
            Intent intent01 = new Intent(selectedActivity.this,MapsActivity.class);
            intent01.putExtra("route","myeonmok2");
            startActivity(intent01);
        }
        if(v.getId() == R.id.mangu1){
            Intent intent01 = new Intent(selectedActivity.this,MapsActivity.class);
            intent01.putExtra("route","mangwoo1");
            startActivity(intent01);
        }if(v.getId() == R.id.mangu2){
            Intent intent01 = new Intent(selectedActivity.this,MapsActivity.class);
            intent01.putExtra("route","mangwoo2");
            startActivity(intent01);
        }

    }


}
