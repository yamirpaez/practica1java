package com.example.javapractica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnSaludar, btnLimpiar, btnCerrar;
    private TextView lblSaludar;
    private EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacion de los objetos Java con las vistas xml
        btnSaludar = (Button) findViewById(R.id.btnSaludar);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);

        lblSaludar = (TextView) findViewById(R.id.lblSaludar);
        txtNombre = (EditText) findViewById(R.id.txtNombre);



        //Codificar evento click boton
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtNombre.getText().toString().matches("")){
                    //Falta capturar el nombre
                    Toast.makeText(MainActivity.this,
                            "Favor de ingresar el nombre",Toast.LENGTH_SHORT).show();
                }else{
                    String saludar = txtNombre.getText().toString();
                    lblSaludar.setText("Hola " + saludar + ", ¿Como estas?");
                }


            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblSaludar.setText("");
                txtNombre.setText("");
                txtNombre.requestFocus();
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}