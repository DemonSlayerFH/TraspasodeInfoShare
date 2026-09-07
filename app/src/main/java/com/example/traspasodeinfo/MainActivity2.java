package com.example.traspasodeinfo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Carga el diseño de la segunda pantalla
        setContentView(R.layout.activity_main2);

        // Recibe el nombre enviado desde MainActivity
        String nombre = getIntent().getStringExtra("nombre");

        // Muestra el nombre recibido en un Toast
        Toast.makeText(this, "Bienvenido " + nombre,Toast.LENGTH_SHORT).show();
    }
}