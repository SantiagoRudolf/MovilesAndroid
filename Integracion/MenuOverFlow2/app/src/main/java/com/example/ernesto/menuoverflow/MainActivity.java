package com.example.ernesto.menuoverflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
    }

    //Método para mostrar y ocultar el menú
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //Método para asignar las funciones correspondientes a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent opcion1 = new Intent(this, ejercicio1.class);
            startActivity(opcion1);
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item2){
            Intent opcion2 = new Intent(this, ejercicio2.class);
            startActivity(opcion2);
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3){
            Intent opcion3 = new Intent(this, ejercicio3.class);
            startActivity(opcion3);
            Toast.makeText(this, "Opción 3", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


}
