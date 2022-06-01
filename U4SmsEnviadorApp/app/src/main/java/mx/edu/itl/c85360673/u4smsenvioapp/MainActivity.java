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
:*  Autor       : Ricardo Raúl Castro Luna    18131227
:*  Fecha       : 17/May/2022
:*  Compilador  : Android Studio Bumblebee | 2021.1.1
:*  Descripción : Clase que permite enviar un mensaje SMS a otro
:*                telefono celular
:*
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/


package mx.edu.itl.c85360673.u4smsenvioapp;
//----------------------------------------------------------------------------------------------
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
//----------------------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {
    private EditText edtTelefonoDestino;
    private EditText edtMensaje;
    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTelefonoDestino = findViewById ( R.id.edtTelefonoDestino );
        edtMensaje         = findViewById ( R.id.edtMensaje         );
    }
    //----------------------------------------------------------------------------------------------
    public void btnEnviarClick ( View v ) {
        if ( validarDatos() == false )
            return;

        SmsManager smsMgr = SmsManager.getDefault();
        smsMgr.sendTextMessage(
                edtTelefonoDestino.getText().toString(),
                null,
                edtMensaje.getText().toString(),
                null,
                null
        );

        Toast.makeText( this, "SMS enviado",
                                    Toast.LENGTH_SHORT).show();
        edtMensaje.setText("");
    }
    //----------------------------------------------------------------------------------------------

    public void btnAcercaDeClick ( View v ) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setTitle( "Acerca de" )
                .setMessage( "SmsEnviador v1.0 \n\n" +
                        "TecNM Campus La Laguna \n\n" +
                        "por Ricardo Raúl Castro Luna (18131227) ")
                .create()
                .show();
    }
    //----------------------------------------------------------------------------------------------
    private boolean validarDatos () {
        if ( edtTelefonoDestino.getText().toString().isEmpty() ) {
            edtTelefonoDestino.setError( "Telefono no puede ser vacio" );
            return false;
        }
        if ( edtMensaje.getText().toString().isEmpty() ) {
            edtMensaje.setError( "Proporcione un mensaje a enviar" );
            return false;
        }
        return true;
    }
    //----------------------------------------------------------------------------------------------
}
