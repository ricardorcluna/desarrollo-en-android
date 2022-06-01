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
:*  Fecha       : 16/Mar/2022
:*  Compilador  : Android Studio Bumblebee 2021.1.1
:*  Descripción : Esta clase carga el diseño del Splash Screen que funciona como
:*		          pantalla de carga para el inicio de la aplicacion.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

    //--------------------------------------------------------------------------------------------
public class SplashActivity extends AppCompatActivity {

    private final int TIEMPO = 2000; // Lapso de 2 segs

    //--------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ocultar la barra de acciones (ActionBar)
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);

        // Mosytar a pantalla completa
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Lanzamos el activity principal
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                // Finalizamos el activity actual
                finish();
            }
        }, TIEMPO);
    }
    //--------------------------------------------------------------------------------------------
}