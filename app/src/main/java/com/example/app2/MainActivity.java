package com.example.app2;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    Button salvar;

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        salvar = findViewById(R.id.button);
        listView = findViewById(R.id.lv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        db = openOrCreateDatabase("mdb.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo VARCHAR, nota TEXT)");
        carregarLista();
        salvar.setOnClickListener(v -> {

            EditText eTitulo = findViewById(R.id.edTitulo);

            String titulo = eTitulo.getText().toString();

            ContentValues cv = new ContentValues();

            cv.put("titulo", titulo);

            db.insert("notas", null, cv);

            Toast.makeText(this, "Inserido", Toast.LENGTH_SHORT).show();

            carregarLista();

        });

    }

    public void carregarLista() {
        ArrayList<String> listaNotas = new ArrayList<>();
       Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
       cursor.moveToFirst();

       while (!cursor.isAfterLast()) {

           String titulo = cursor.getString(cursor.getColumnIndex("titulo"));

           listaNotas.add(titulo);

           cursor.moveToNext();

       }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaNotas);
       listView.setAdapter(adapter);

       listView.setOnItemClickListener( (parent, view, position, id) -> {
           Intent intent = new Intent(this, MainActivity2.class);
            Bundle b = new Bundle();
            String s = listView.getItemAtPosition(position).toString();
            b.putString("Posicao", s);
            intent.putExtras(b);
            startActivity(intent);
           });
       }
    }
