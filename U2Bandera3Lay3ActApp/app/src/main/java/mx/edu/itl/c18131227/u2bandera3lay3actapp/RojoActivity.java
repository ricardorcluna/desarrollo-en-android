/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*      	  Clase que despliega la seccion rojo de la bandera de Mexico
:*
:*  Archivo     : RojoActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 06/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase contiene los diferentes ciclos de vida de las actividades
:*¨               y un metodo que invoca el regreso hacia VerdeActivity.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u2bandera3lay3actapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RojoActivity extends AppCompatActivity {
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rojo);

        Toast.makeText(this, "Rojo onCreate", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    public void btnAtrasClick ( View v){
        //Terminamos el activity actual y regresa el control al Activity que lo invocó
        finish();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Rojo onStart", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Rojo onResume", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Rojo onPause", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Rojo onStop", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Rojo onDestroy", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Rojo onRestart", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
}