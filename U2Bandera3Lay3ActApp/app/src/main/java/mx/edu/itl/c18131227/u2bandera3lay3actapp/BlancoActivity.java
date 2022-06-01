/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*      	  Clase que despliega la seccion blanco de la bandera de Mexico
:*
:*  Archivo     : BlancoActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 06/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase contiene los diferentes ciclos de vida de las actividades
:*¨               y un metodo que invoca RojoActivity y el regreso hacia VerdeActivity.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u2bandera3lay3actapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BlancoActivity extends AppCompatActivity {
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanco);

        Toast.makeText(this, "Blanco onCreate", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    public void btnAtrasClick ( View v){
        //Terminamos el activity actual y regresa el control al Activity que lo invocó
        finish();
    }
    //----------------------------------------------------------------------------------------------
    public void btnSiguienteClick ( View v){
        //Preparamos la invoccacion al BlancoActivity
        Intent intent = new Intent ( this, RojoActivity.class );
        startActivity ( intent );
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Blanco onStart", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Blanco onResume", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Blanco onPause", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Blanco onStop", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Blanco onDestroy", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Blanco onRestart", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
}