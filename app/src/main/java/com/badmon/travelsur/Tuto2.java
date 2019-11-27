package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tuto2 extends AppCompatActivity {

    ImageView img_tuto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto2);

        img_tuto2 = findViewById(R.id.tuto2);
        img_tuto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(Tuto2.this, Tuto3.class);
                Tuto2.this.startActivity(intentReg);
            }
        });
    }
}
