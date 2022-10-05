package com.example.t11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private TextView nombre;
    String salidaTexto="";

    //operaciones//



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.caja_salida);
        nombre = (TextView) findViewById(R.id.caja);
    }

    public void onRadioButtonClick(View view){
        boolean seleccionado = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.rb1:
                if (seleccionado){
                   salidaTexto = ""+nombre.getText().toString()+"\n";
                   salidaTexto += "Seleccionaste Carros";
                }
                break;

            case R.id.rb2:
                if (seleccionado){
                    salidaTexto = ""+nombre.getText().toString()+"\n";
                    salidaTexto += "Seleccionaste Motos";
                }
                break;
        }
        texto.setText(salidaTexto);
    }
}