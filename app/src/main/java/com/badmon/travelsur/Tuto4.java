package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tuto4 extends AppCompatActivity {

    ImageView img_tuto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto4);

        img_tuto4 = findViewById(R.id.tuto4);
        img_tuto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(Tuto4.this, Tuto5.class);
                Tuto4.this.startActivity(intentReg);
            }
        });
    }
}
