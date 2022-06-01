/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: ENE-JUN/2022    HORA: 10-11 HRS
:*
:*                       descripcion breve de la clase (centrado)
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Ricardo Raúl Castro Luna 18131227
:*  Fecha       : 22/Feb/2022
:*  Compilador  : Android Studio Artic Fox 2020.3
:*  Descripci�n : Los dialogos de alerta que se despliegan son las siguientes:
                   Toast de duracion corta
                   Toast de duracion larga
                   SnackBar
                   Cuadro de dialogo basico
                   Dialogo basico con boton OK
                   Dialogo basico con boton OK y CANCEL
                   Dialogo con botones de radio seleccion unica
                   Dialogo con botones casillas de verificacion seleccion multiple
                   Dialogo con layout de login incrustado
                   Acerca de
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*  dd/mmm/aaaa Fultano de tal       Motivo de la modificacion, puede ser en mas de 1 renglon.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.c18131227.u2cuadrodialogoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.ArrayList;


import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //----------------------------------------------------------------------------------------------
    // Mensaje Toast de duracion corta

    public void btnToastCortoClick ( View v ) {
        Toast.makeText( this, "Toast corto", Toast.LENGTH_SHORT).show();
    }

    //----------------------------------------------------------------------------------------------
    // Mensaje Toast de duracion larga

    public void btnToastLargoClick ( View v ) {
        Toast.makeText( this, "Toast Larga", Toast.LENGTH_LONG).show();
    }

    //----------------------------------------------------------------------------------------------
    // Mensaje SnackBar de duracion corta

    public void btnSnackBarClick (View v) {
        LinearLayout layoutPrincipal = findViewById( R.id.layoutPrincipal );
        Snackbar.make( layoutPrincipal, "Esto es un snackbar", Snackbar.LENGTH_SHORT).show();
    }



    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo basico sin bootnes

    public void btnDialogoBasicoClick (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setMessage( "Cuadro de dialogo basico" ).create().show();
    }


    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo con boton Ok

    public void btnDialogoBotonOklick (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setMessage( "Dialogo con boton ACEPTAR" )
                .setTitle( "Android" )
                .setPositiveButton( "Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick ( DialogInterface dialogInterface, int i ) {
                        mostrarToast("Aceptar");
                    }
                } )
                .create()
                .show();
    }


    //----------------------------------------------------------------------------------------------

    public void mostrarToast (String mensaje) {
         Toast.makeText( MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
    }

    //----------------------------------------------------------------------------------------------
    // Mensaje Toast de duracion larga

    public void btnDialogoBotonesOkCancellick (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder ( this );
        builder.setTitle( "Android" )
                .setMessage( "Mensaje con botones Aceptar y Cancelar" )
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mostrarToast( "Aceptar" );
                    }
                } )
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                } )
                .setCancelable( false )
                .create()
                .show();
    }
    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo con lista de opciones basicas

    private CharSequence colores [] = { "Verde", "Blanco", "Rojo" };

    public void btnDialogoListaBasicaClick ( View v ) {
        AlertDialog.Builder builder = new AlertDialog.Builder ( this );
        builder.setTitle ( "Escoja un color bonito:" )
                .setItems ( colores, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick ( DialogInterface dialogInterface, int i ) {
                        mostrarToast ( "Color seleccionado: " + colores [ i ] );
                    }
                } )
                .create ()
                .show ();
    }

    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo con lista de opciones con botones de radio y seleccion unica

    private int iColorFavorito = 2;  // Por default el Rojo

    public void btnDialogoListaSeleccionUnicaClick ( View v ) {
        AlertDialog.Builder builder = new AlertDialog.Builder ( this );
        builder.setTitle ( "Escoge tu color favorito:" )
                .setSingleChoiceItems ( colores, iColorFavorito, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick ( DialogInterface dialogInterface, int i ) {
                        iColorFavorito = i;
                        mostrarToast  ( "Escogi�: " + colores [ i ] );
                    }
                } )
                .setPositiveButton ( "Aceptar", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick ( DialogInterface dialogInterface, int i ) {
                        mostrarToast ( "Nuevo color favorito: " + colores [ iColorFavorito ] );
                    }
                } )
                .create()
                .show();
    }

    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo con lista de opciones con casillas de verificacion para seleccion multiple

    private boolean coloresSeleccionados [] = { false, false, false };  // Ninguna aparecera selecccionada
    private ArrayList<String> coloresFavoritos = new ArrayList<>();

    public void btnDialogoListaSeleccionMultipleClick ( View v ) {
        AlertDialog.Builder builder = new AlertDialog.Builder ( this );
        builder.setTitle ( "Seleccione sus colores favoritos:" )
                .setMultiChoiceItems ( colores, coloresSeleccionados, new DialogInterface.OnMultiChoiceClickListener () {
                    @Override
                    public void onClick ( DialogInterface dialogInterface, int i, boolean b ) {
                        if ( b ) {
                            mostrarToast ( "Color seleccionado: " + colores [ i ] );
                            coloresFavoritos.add ( colores [ i ].toString () );
                        }
                        else {
                            mostrarToast ( "Color deseleccionado: " + colores [ i ] );
                            coloresFavoritos.remove ( colores [ i ].toString () );
                        }
                    }
                })
                .setPositiveButton ( "Aceptar", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick ( DialogInterface dialogInterface, int i ) {
                        mostrarToast ( "Colores favoritos: " + coloresFavoritos );
                    }
                })
                .create()
                .show();
    }

    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo con layout de accesp (login)

    private EditText edtUsuario;
    private EditText edtContrasena;
    private View     login_Layout;

    public void btnDialogoLayoutIncrustadoClick (View v) {
        // Obtener la instancia del layour de login y de sus campos Usuario y Contraseña
        login_Layout = getLayoutInflater().inflate( R.layout.login_layout, null );
        edtUsuario = login_Layout.findViewById( R.id.edtUsuario );
        edtContrasena = login_Layout.findViewById( R.id.edtContrasena );

        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setTitle( "Acceso" )
                .setIcon( R.drawable.loguito_itl )
                .setView( login_Layout )
                .setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mostrarToast("Bienvenido" +
                                    edtUsuario.getText().toString() + "(" +
                                    edtContrasena.getText().toString() + ")"
                                );
                    }
                })
                .setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                } )
                .setCancelable( false)
                .create()
                .show();
    }

    //----------------------------------------------------------------------------------------------
    // Cuadro de dialogo de Acerca de

    public void btnAcercaDeClick (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setTitle( "Acerca de" )
                .setIcon( R.drawable.loguito_itl )
                .setMessage( "CuadrosDialog v1.0 \n\n" +
                            "TecNM Campus La Laguna \n\n" +
                            "por Ricardo Raúl Castro Luna (18131227) ")
                .create()
                .show();
    }

    //----------------------------------------------------------------------------------------------
}