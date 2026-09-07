package com.example.traspasodeinfo;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText txtNombre;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectamos las variables con el XML
        txtNombre = findViewById(R.id.txtNombre);
        btnIngresar = findViewById(R.id.btnIngresar);
        // Acción del botón
        btnIngresar.setOnClickListener(v -> {
            // Obtenemos el nombre
            String nombre = txtNombre.getText().toString();
            // Validamos que no esté vacío
            if (nombre.isEmpty()) {
                Toast.makeText(this, "Ingresa tu nombre", Toast.LENGTH_SHORT).show();
            } else {
                // Llamamos al metodo que envía los datos
                EnviarDatos(nombre);
            }
        });
    }
    // Metodo para enviar el nombre a MainActivity2
    private void EnviarDatos(String nombre) {

        Intent intent = new Intent(this, MainActivity2.class);

        // Enviamos el nombre
        intent.putExtra("nombre", nombre);

        // Abrimos la segunda Activity
        startActivity(intent);
    }
}