package com.example.t11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private TextView nombre;
    String salidaTexto="";

    //operaciones//
    private EditText edt1, edt2;

    //toogle e imagen//
    private ImageView imagen;
    private ToggleButton toogle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.caja_salida);
        nombre = (TextView) findViewById(R.id.caja);

        edt1 = (EditText) findViewById(R.id.txt_1);
        edt2 = (EditText) findViewById(R.id.txt_2);

        toogle = (ToggleButton)findViewById(R.id.toggle);
        imagen = (ImageView)findViewById(R.id.imageView);

        toogle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    texto.setText("Imagen invisible");
                    imagen.setVisibility(View.INVISIBLE);
                }else{
                    texto.setText("imagen visible");
                    imagen.setVisibility(View.VISIBLE);

                }

            }
        });

    }

    public void onRadioButtonClick(View view){
        boolean seleccionado = ((RadioButton) view).isChecked();
        int valor1 = Integer.parseInt(edt1.getText().toString());
        int valor2 = Integer.parseInt(edt2.getText().toString());
        int resultado;

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

            case R.id.rb3:
                if (seleccionado){
                    resultado = valor1 + valor2;
                    salidaTexto = "El resultado es: " + String.valueOf(resultado);
                }
                break;

            case R.id.rb4:
                if (seleccionado){
                    resultado = valor1 - valor2;
                    salidaTexto = "El resultado es: " + String.valueOf(resultado);
                }
                break;

            case R.id.rb5:
                if (seleccionado){
                    resultado = valor1 * valor2;
                    salidaTexto = "El resultado es: " + String.valueOf(resultado);
                }
                break;

            case R.id.rb6:
                if (seleccionado){
                    resultado = valor1 / valor2;
                    salidaTexto ="El resultado es: " + String.valueOf(resultado);
                }
                break;
        }
        texto.setText(salidaTexto);
    }

    public void encuesta(View view){
        boolean seleccionado = ((CheckBox) view).isChecked();
        switch (view.getId()){

            case R.id.ask1:
            if(seleccionado){
                salidaTexto += "Le gusta la cerveza \n";
            }
            break;

            case R.id.ask2:
                if(seleccionado){
                    salidaTexto += "Le gusta el mezcal \n";
                }
                break;

            case R.id.ask3:
                if(seleccionado){
                    salidaTexto += "Le gusta el pulque \n";
                }
                break;

            case R.id.ask4:
                if(seleccionado){
                    salidaTexto += "Le gusta el tequila \n";
                }
                break;
        }
    }

    public void enviar(View view){

        texto.setText(salidaTexto);
        salidaTexto = "";
    }


}