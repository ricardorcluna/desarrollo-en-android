/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*      	  Clase que despliega la seccion verde de la bandera de Mexico
:*
:*  Archivo     : VerdeActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 06/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase contiene los diferentes ciclos de vida de las actividades
:*¨               y un metodo que invoca BlancoActivity.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u2bandera3lay3actapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VerdeActivity extends AppCompatActivity {
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verde);
        Toast.makeText(this, "Verde onCreate", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    public void btnSiguienteClick (View v) {
        //Preparamos la invoccacion al BlancoActivity
        Intent intent = new Intent(this, BlancoActivity.class);
        //primer argumento: referencia del activity que llama
        //segudno argumento es al que se tiene la opcion de llamar
        startActivity(intent);
    }
    //----------------------------------------------------------------------------------------------
    public void btnProcesarClick ( View v ){
        //Mostramos un alert dialog con la informacion de acerca de
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Acerca De")
                .setIcon(R.drawable.logo)
                .setMessage("Instituto tecnologico de la laguna \n\n " +
                        "U2Banderita3Lay3ActApp v1.0.0 \n\n " +
                        "Ricardo Raúl Castro Luna (18131227)")
                .create()
                .show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Verde onStart", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Verde onResume", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Verde onPause", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Verde onStop", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Verde onDestroy", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Verde onRestart", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------------------
}