package com.example.t11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class T12 extends AppCompatActivity {

    private TextView tv1;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t12);

        tv1 = (TextView)findViewById(R.id.caja_12);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText(dato);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {
                "Primero",
                "Segundo",
                "Tercero",
                "cuarto",
                "quinto"
        };

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_personal,opciones);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                tv1.setText("Spinner: "+spinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void Regresar(View view){

        Toast.makeText(this,"Spinner"+spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
        Intent b = new Intent(this,MainActivity.class);
        //b.putExtra("dato",nombre.getText().toString());
        startActivity(b);
    }

}