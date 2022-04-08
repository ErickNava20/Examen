package com.uca.examen_ericknava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Respuesta, Siguiente, Salir;
    TextView Pregunta, Numpregunta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Respuesta = findViewById(R.id. Respuesta);

        Pregunta = findViewById(R.id.Pregunta);
        Numpregunta = findViewById(R.id.Numpregunta);

        Siguiente = findViewById(R.id.Siguiente);
        Salir = findViewById(R.id.Salir);

    }
    public void Respuesta (View vista){

    }
    public  void  Siguiente (View vista) {
        Toast.makeText(this, "Pulse respuesta", Toast.LENGTH_SHORT).show();
        Numpregunta.setText("Respuesta es: ");
        Pregunta.setText("Se trata de un ente abstracto usado en programación que permite separar los diferentes componentes de un programa, simplificando así su elaboración, depuración y posteriores mejoras.");
    }

    {
        Numpregunta.setText("Pregunta 2");
        Pregunta.setText("2-¿Cuales son la diferencias de atributos y métodos?");
    }
    {
        Numpregunta.setText("Respuesta es: ");
        Pregunta.setText("Los atributos son las caracteristicas del objeto y los métodos son las acciones que realizara el objeto");
    }
    {
        Numpregunta.setText("Pregunta 3");
        Pregunta.setText("¿Que es una clase?");
    }
    {
        Numpregunta.setText("Respuesta es: ");
        Pregunta.setText("Es la que define las caracteristicas y funciones de objeto");
    }
    {
        Numpregunta.setText("Pregunta 4");
        Pregunta.setText("Es el proceso de definir los atributos y los métodos de una clase\"");
    }
    {
        Numpregunta.setText("Respuesta es:");
        Pregunta.setText("Es la abstracción");
    }
    {
        Numpregunta.setText("Pregunta 5");
        Pregunta.setText("Las clases hijo mantienen caracteristicas tales como atributos y métodos, otorgándole a las clases el derecgo del padre");
    }
    {
        Numpregunta.setText("Respuesta es: ");
        Pregunta.setText("Herencia");
    }
    {
        Numpregunta.setText("Pregunta 6");
        Pregunta.setText("Protege la información de manipulaciones no autorizadas");
    }
    {
        Numpregunta.setText("Respuesta es: ");
        Pregunta.setText("Encapsulamiento");
    }
    public void Salir (View vista) { finish();}
}