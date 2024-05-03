package com.example.parcial2_appsmoviles;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtVal1, edtVal2;
    Button btn;
    String dato;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public static final String dataUser = "dataUser";
    private static final int modo_private = Context.MODE_PRIVATE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 =findViewById(R.id.edtVal2);
        btn = findViewById(R.id.btn);

        sharedPreferences = getSharedPreferences(dataUser, modo_private);
        editor = sharedPreferences.edit();

        dato = getApplicationContext().getSharedPreferences(dataUser,modo_private).getString("user","0" );

        if (!dato.equalsIgnoreCase("0")){
            Intent i = new Intent(MainActivity.this, Pantalla2.class);
            startActivity(i);
            finish();
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String caja1 = edtVal1.getText().toString();
                String caja2 = edtVal2.getText().toString();

                if (!caja1.equals("") && !caja2.equals("")) {
                    Intent ingresar = new Intent(MainActivity.this, Pantalla2.class);
                    startActivity(ingresar);
                }else {
                    Toast.makeText(MainActivity.this, "Por favor completa todos los campos", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}