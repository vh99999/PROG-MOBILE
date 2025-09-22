package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IMC_Resultado extends AppCompatActivity {

    TextView tvNome, tvPeso2, tvAltura2, tvIMC;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imc_resultado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        tvIMC = findViewById(R.id.tvIMC);
        tvAltura2 = findViewById(R.id.tvAltura2);
        tvPeso2 = findViewById(R.id.tvPeso2);
        tvNome = findViewById(R.id.tvNome);
        imageView2 = findViewById(R.id.imageView2);


        Intent i = getIntent();
        Bundle b = i.getExtras();
        Double Peso = b.getDouble("Peso");
        Double Altura = b.getDouble("Altura");
        String Nome = b.getString("Nome");

        Double imc = Peso/(Altura+Altura);

        tvIMC.setText(Double.toString(imc));
        tvAltura2.setText(Double.toString(Altura));
        tvPeso2.setText(Double.toString(Peso));
        tvNome.setText(Nome);

        imageView2.setImageResource(R.drawable.perfil);

        if(imc<18.9){imageView2.setImageResource(R.drawable.abaixopeso);

        }
        if(imc>=18.9 && imc < 25){imageView2.setImageResource(R.drawable.normal);}
        if(imc>=25 && imc < 30){imageView2.setImageResource(R.drawable.sobrepeso);}
        if(imc>=30 && imc < 35){imageView2.setImageResource(R.drawable.obesidade1);}



    }
}