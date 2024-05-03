package com.example.parcial2_appsmoviles;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2_appsmoviles.adaptadores.UsuarioAdaptador;
import com.example.parcial2_appsmoviles.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Pantalla2 extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> listaUsuarios = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg","Ruben","Movil");
        Usuario usu2 = new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg","Enzo","Chelsea");
        Usuario usu3 = new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg","Modric","Real Madrid");
        Usuario usu4 = new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg","Bellingham","Real Madrid");

        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(listaUsuarios));


    }
}