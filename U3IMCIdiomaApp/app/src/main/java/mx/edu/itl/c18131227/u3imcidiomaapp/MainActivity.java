/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2022    HORA: 10-11 HRS
:*
:*      	  Clase que despliega el main activity de la aplicacion
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 22/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase contiene los botones para calcular el IMC y Acerca De
:*                  de la aplicación, ademas de deplegar el .xml del activity donde se
:*                  realizaran el ingreso de valores y mostrar el resultado.
:*                  Esta aplicacion se diferencia de sus anteriores por el uso de strings.xml
:*                  para facilitar la modificacion de textos constantes, ademas de que este
:*                  mismo nos ayudara a establecer diferentes idiomas disponibles a desplegar
:*                  al usuario.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/


package mx.edu.itl.c18131227.u3imcidiomaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
//--------------------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {
    //--------------------------------------------------------------------------------------------
    private EditText edtPeso;
    private EditText edtEstatura;
    //--------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ocultar la barra de acciones (ActionBar)
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        // Obtenemos las referencias a los EditText de la IU
        edtEstatura = findViewById( R.id.edtEstatura );
        edtPeso = findViewById( R.id.edtPeso );
    }
    //--------------------------------------------------------------------------------------------
    public void btnCalcularIMCClick ( View v ){
        try {
            float peso = Float.parseFloat( edtPeso.getText().toString() );
            float estatura = Float.parseFloat( edtEstatura.getText().toString() );

            // Validar que el peso o la estutra no sean cero
            if ( peso <= 0 ){
                edtPeso.setError ( getString(R.string.error_peso) );
                edtPeso.requestFocus();
                return;
            }

            if ( estatura <= 0 ){
                edtEstatura.setError ( getString(R.string.error_estatura) );
                edtEstatura.requestFocus();
                return;
            }

            // Calculamos el IMC y determinamos la condicion de salud
            float imc = (float) ( peso / Math.pow( estatura, 2 ) );

            String condicion = getString(R.string.leyenda_condicion);

            if ( imc < 15 )
                condicion += getString(R.string.Delgadez_muy_severa);
            else if ( imc >= 15 && imc < 16 )
                condicion += getString(R.string.Delgadez_severa);
            else if ( imc >= 16 && imc < 18.5 )
                condicion += getString(R.string.Delgadez);
            else if ( imc >= 18.5 && imc < 25 )
                condicion += getString(R.string.Peso_saludable);
            else if ( imc >= 25 && imc < 30 )
                condicion += getString(R.string.Sobrepeso);
            else if ( imc >= 30 && imc < 35 )
                condicion += getString(R.string.Obesidad_moderada);
            else if ( imc >= 35 && imc < 40 )
                condicion += getString(R.string.Obesidad_severa);
            else if ( imc >= 40 )
                condicion += getString(R.string.Obesidad_muy_severa);

            AlertDialog.Builder builder = new AlertDialog.Builder( this );
            builder.setTitle( getString(R.string.IMC) )
                    .setMessage( getString(R.string.IMC) + "= " + imc + "\n\n" + condicion )
                    .setPositiveButton(getString(R.string.leyenda_Aceptar), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    })
                    .create()
                    .show();
        } catch ( Exception e) {
            Toast.makeText(this, getString(R.string.try_catch),
                    Toast.LENGTH_SHORT).show();
        }
    }
    //--------------------------------------------------------------------------------------------
    public void btnAcercaDeClick (View v) {
        Intent intent = new Intent( this, AcercaDeActivity.class);
        startActivity( intent );
    }
    //--------------------------------------------------------------------------------------------
}