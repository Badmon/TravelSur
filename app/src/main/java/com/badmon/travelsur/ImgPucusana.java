package com.badmon.travelsur;

import androidx.appcompat.app.AppCompatActivity;
import co.gofynd.gravityview.GravityView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class ImgPucusana extends AppCompatActivity {

    private ImageView img;
    private GravityView gravityView;
    private boolean esSoportado = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imgpucusana);

        init();
        if (esSoportado){
            this.gravityView.setImage(img, R.drawable.pucusana).center();
        }else{
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.pucusana);
            img.setImageBitmap(bitmap);
        }

    }

    private void init() {
        this.img = findViewById(R.id.imageView);
        this.gravityView = GravityView.getInstance(getBaseContext());
        this.esSoportado = gravityView.deviceSupported();
    }

    @Override
    protected void onResume(){
        super.onResume();
        gravityView.registerListener();
    }

    @Override
    protected void onStop(){
        super.onStop();
        gravityView.unRegisterListener();
    }
}