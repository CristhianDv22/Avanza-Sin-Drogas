package com.example.user1.infodrugs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);

        Button boton_lugares = (Button) findViewById(R.id.button1);
        boton_lugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lugares_ayuda = new Intent(GuiaActivity.this, MapsActivity.class);
                startActivity(lugares_ayuda);
            }
        });


        Button boton_blog = (Button) findViewById(R.id.button_blog);
        boton_blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir_aBlog = new Intent(GuiaActivity.this, ChatActivity.class);
                startActivity(ir_aBlog);
            }
        });


        Button boton_test = (Button) findViewById(R.id.button_test);
        boton_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir_aTest = new Intent(GuiaActivity.this, Questions.class);
                startActivity(ir_aTest);
            }
        });


        Button boton_diccionario = (Button) findViewById(R.id.button_diccionario);
        boton_diccionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir_aJergas = new Intent(GuiaActivity.this, JergasActivity.class);
                startActivity(ir_aJergas);
            }
        });


        Button boton_bibliografia = (Button) findViewById(R.id.button_bibliografia);
        boton_bibliografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir_aBibliografia = new Intent(GuiaActivity.this, BibliografiaActivity.class);
                startActivity(ir_aBibliografia);
            }
        });

        Button boton_autores = (Button) findViewById(R.id.button_autores);
        boton_autores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir_aAutores = new Intent(GuiaActivity.this, AutoresActivity.class);
                startActivity(ir_aAutores);
            }
        });

    }
}
