/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: ENE-JUN/2021    HORA: 10-11 HRS
:*
:*                          Clase principal de la app
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Ricardo Raúl Castro Luna     18131227
:*  Fecha       : 20/May/2022
:*  Compilador  : Android Studio Bumblebee | 2021.1.1
:*  Descripción : Clase que principal que contiene el activity para recibir
:*                un mensaje SMS
:*
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c85360673.u4smsreceptorapp;
//----------------------------------------------------------------------------------------------
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//----------------------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //----------------------------------------------------------------------------------------------
}
