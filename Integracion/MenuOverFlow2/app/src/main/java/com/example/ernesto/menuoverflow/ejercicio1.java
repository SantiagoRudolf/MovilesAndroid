package com.example.ernesto.menuoverflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ejercicio1 extends AppCompatActivity {

    private ListView lv1;
    private TextView tv1;

    private String nombres [] = {"Hamburguesa", "manzana" , "pechuga de pollo", "papas fritas","dsfsdfdf","ddf", "pechuga de pollo", "papas fritas"};
    private String calorias [] = {"230","52","75","150","43","75","150","43"};
    private String HDC [] = {"0.5%","5.2%","0.75%","1.5%","1.6%","0.75%","1.5%","1.6%"};
    private String proteinas [] = {"14%","12%","7.5%","15%","56%","7.5%","15%","56%"};
    private String grasas [] = {"14%","12%","7.5%","15%","6%","7.5%","15%","6%"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_comida, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                tv1.setText("Las comida es:" + lv1.getItemAtPosition(i) + "tiene" + calorias[i] + "calorias," + HDC[i] + "Hidratos de Carbono, " + proteinas[i] +  "grasas " +grasas[i]);
            }
        });
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
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item2){
            Intent opcion2 = new Intent(this, ejercicio2.class);
            startActivity(opcion2);
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3){
            Toast.makeText(this, "Opción 3", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

