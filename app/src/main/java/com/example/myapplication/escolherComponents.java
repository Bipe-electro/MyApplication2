package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class escolherComponents extends AppCompatActivity {

    private Button editButtonescolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_escolher_components);
        Spinner spinner = (Spinner) findViewById(R.id.lista_spinner_component);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(

                this,
                        R.array.lista_de_componentes,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        IniciarComponent();

        editButtonescolhido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(escolherComponents.this,FormLogin.class);
                startActivity(intent);
            }
        });


    }
    private void IniciarComponent(){
        editButtonescolhido = findViewById(R.id.editButtonescolhido);}

}