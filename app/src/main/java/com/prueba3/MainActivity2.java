package com.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    Spinner lugarcito;
    Button  botoncito;

ArrayList<String> v = new  ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lugarcito = (Spinner)findViewById(R.id.lugar);
        botoncito = (Button) findViewById(R.id.botoncito);

        v.add("..");
        v.add("Moscú");
        v.add("Berlin");
        v.add("Chernobyl");
        ArrayAdapter<String> a = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,v);
        lugarcito.setAdapter(a);
        botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

            }
        });




    }
}