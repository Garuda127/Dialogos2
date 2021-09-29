package com.example.dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 Button btn;
 Button btnlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Dialogo
        btn = findViewById(R.id.btnDialogo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);//se crea el dialogo

                builder.setMessage("Hola, soy un dialogo")//se agrega un mensaje
                        .setTitle("Dialogo");//se agrega un titulo
                //se agrega un boton con si y lanza un toast
                builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Gracias", Toast.LENGTH_SHORT).show();
                    }
                });
                // se agrega el boton negativo
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,":c",Toast.LENGTH_LONG).show();
                    }
                });
                //Boton Neutral
                builder.setNeutralButton("Omitir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                AlertDialog dialog = builder.create();//creamos el dialogo
                dialog.show();//mostramos el dialogo
            }
        });
        //Dialogo
        //Lista

        btnlist=findViewById(R.id.btnLista);
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder list = new AlertDialog.Builder(MainActivity.this);
                list.setTitle("Lista")
                        .setItems(R.array.Colors, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog1 = list.create();//creamos el dialogo
                dialog1.show();//mostramos el dialogo
            }
        });
        //Lista
    }
}