package com.proyecto.eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    EditText nombre, correo;
    Button comenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.txtnombre);
        correo = findViewById(R.id.txtcorreo);
        comenzar = findViewById(R.id.botoncomenzar);

        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(TextUtils.isEmpty( nombre.getText() )){
//                    nombre.setError("Obligatorio");
//                    return;
//                }
//                if( TextUtils.isEmpty( correo.getText() ) ){
//                    correo.setError("Obligatorio");
//                    return;
//                }

                Intent intent = new Intent( getApplicationContext(), PrincipalActivity.class );
                startActivity(intent);

            }
        });


    }
}