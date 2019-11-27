package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Prueba extends AppCompatActivity {

    ImageView Img_playapucusana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);


        Img_playapucusana = findViewById(R.id.img_playapucusna);
        Img_playapucusana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(Prueba.this, ImgPucusana.class);
                Prueba.this.startActivity(intentReg);
            }
        });


    }
}
