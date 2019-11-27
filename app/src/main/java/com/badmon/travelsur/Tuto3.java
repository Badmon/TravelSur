package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tuto3 extends AppCompatActivity {

    ImageView img_tuto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto3);

        img_tuto3 = findViewById(R.id.tuto3);
        img_tuto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(Tuto3.this, Tuto4.class);
                Tuto3.this.startActivity(intentReg);
            }
        });
    }
}
