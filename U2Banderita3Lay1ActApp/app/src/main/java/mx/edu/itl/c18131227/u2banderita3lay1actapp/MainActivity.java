/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*      	  Clase que despliega en pantalla la seccion verde de la  bandera de Mexico
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 06/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase carga el diseño de pantalla en activity_verde.xml
:*		          que contiene 1 de las secciones de la bandera de Mexico y
:*		          ademas de contener el metodo de "btnProcesarClick" donde
:*                utilizando if para realizar diferentes acciones en este.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u2banderita3lay1actapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //--------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verde);
    }

    //--------------------------------------------------------------------------------------------

    public void btnProcesarClick (View v){
        if ( v.getId () == R.id.btnAcercaDe ){
            // Mostramos un AlertDialog con la informacion de acerca de
            AlertDialog.Builder builder = new AlertDialog.Builder( this );
            builder.setTitle( "Acerca de" )
                    .setIcon( R.drawable.loguito_itl )
                    .setMessage( "Banderita3Lay1ActApp v1.0 \n\n" +
                            "TecNM Campus La Laguna \n\n" +
                            "por Ricardo Raúl Castro Luna (18131227) ")
                    .create()
                    .show();
        } else if ( v.getId () == R.id.btnVerdeSiguiente ) {
            // Cambiamos al layout blanco
            setContentView( R.layout.activity_blanco );
        } else if ( v.getId () == R.id.btnBlancoAtras ) {
            // Regresamos a la seccion verde
            setContentView( R.layout.activity_verde );
        } else if ( v.getId () == R.id.btnBlancoSiguiente ) {
            // Cambiamos al layout rojo
            setContentView( R.layout.activity_rojo );
        } else if ( v.getId () == R.id.btnRojoAtras ) {
            // Regresamos a  la seccion Blanco
            setContentView( R.layout.activity_blanco );
        }
    }

    //--------------------------------------------------------------------------------------------
}