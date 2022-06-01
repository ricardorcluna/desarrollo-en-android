/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*      	  Clase que despliega el Splash de la aplicacion
:*
:*  Archivo     : SplashActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 06/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase carga el diseño del Splash Screen que funciona como
:*		          pantalla de carga para el inicio de la aplicacion.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u2bandera3lay3actapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //----------------------------------------------------------------------------------------------
        //La pantalla de splash se presentara en orientación vertical y en pantalla completa
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
    //----------------------------------------------------------------------------------------------
        //Mostrar la barra de acciones ActionBar
        this.getSupportActionBar().hide();
    //----------------------------------------------------------------------------------------------
        setContentView(R.layout.activity_splash);
    //----------------------------------------------------------------------------------------------
        //Hacer la transicion al siguiente Activity despues de 3 segundos
        new Handler().postDelayed(new Runnable () {
            @Override
            public void run(){
                Intent intent = new Intent(SplashActivity.this, VerdeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    //----------------------------------------------------------------------------------------------
    }
}