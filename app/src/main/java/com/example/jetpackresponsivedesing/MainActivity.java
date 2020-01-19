package com.example.jetpackresponsivedesing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();//Ocultar action bar

        btnLogin = findViewById(R.id.buttonLogin);//referencia al elemento visual

        //Definir evento click -> login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotasActivity.class);
                startActivity(intent);
            }
        });
    }
}
