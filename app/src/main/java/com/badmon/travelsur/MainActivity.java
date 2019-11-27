package com.badmon.travelsur;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    Button  btn_scaneo, btn_restau;
    String qr="hola",contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_scaneo = findViewById(R.id.btn_scan);



        btn_restau = findViewById(R.id.btn_restaurantes);
        btn_restau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(MainActivity.this, Restaurantes.class);
                MainActivity.this.startActivity(intentReg);
            }
        });


        final Activity activity = this;
        btn_scaneo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if (result != null) {
             contenido = result.getContents();
            if (contenido.equals(qr)) {
                //Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                Intent intentReg = new Intent(MainActivity.this, Prueba.class);
                MainActivity.this.startActivity(intentReg);
            }else {
                Toast.makeText(this, "Error de QR", Toast.LENGTH_LONG).show();
            }
        }
        else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

}
