package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tuto1 extends AppCompatActivity {

    ImageView img_tuto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto1);

        img_tuto1 = findViewById(R.id.tuto1);
        img_tuto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(Tuto1.this, MainActivity.class);
                Tuto1.this.startActivity(intentReg);
            }
        });

    }



}
