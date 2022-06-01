/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*      	  Clase que despliega el Acerca De de la aplicacion
:*
:*  Archivo     : AcercaDeActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 16/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase carga el diseño del Acerca De que funciona como
:*		          pantalla de presentacion o informacion sobre el equipo del trabajo de la app.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

    //--------------------------------------------------------------------------------------------
public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ocultar la barra de acciones (ActionBar)
        getSupportActionBar().hide();

        setContentView(R.layout.activity_acercade);
    }
    //--------------------------------------------------------------------------------------------
}