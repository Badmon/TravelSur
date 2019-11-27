package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tuto5 extends AppCompatActivity {

    ImageView img_tuto5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto5);

        img_tuto5 = findViewById(R.id.tuto5);
        img_tuto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(Tuto5.this, MainActivity.class);
                Tuto5.this.startActivity(intentReg);
            }
        });
    }
}
