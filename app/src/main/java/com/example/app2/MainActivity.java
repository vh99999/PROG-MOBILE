package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText edPeso, edAltura, edNome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edPeso = findViewById(R.id.edPeso);
        edAltura = findViewById(R.id.edAltura);
        edNome2 = findViewById(R.id.edNome2);
        button = findViewById(R.id.button4);
        button.setOnClickListener( v ->{
            Intent intent = new Intent(this, IMC_Resultado.class);
            Bundle b = new Bundle();
            double Peso = Double.parseDouble(edPeso.getText().toString());
            double Altura = Double.parseDouble(edAltura.getText().toString());
            String Nome = String.valueOf(edNome2.getText());
            b.putDouble("Peso", Peso);
            b.putDouble("Altura", Altura);
            b.putString("Nome", Nome);
            intent.putExtras(b);
            startActivity(intent);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}