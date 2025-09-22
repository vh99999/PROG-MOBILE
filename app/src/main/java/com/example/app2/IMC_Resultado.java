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

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, Res1, Res2, Res3, Res4, Res5, Res6, Res7, Res8, Res9, Res10;

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

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

        Res1 = findViewById(R.id.Res1);
        Res2 = findViewById(R.id.Res2);
        Res3 = findViewById(R.id.Res3);
        Res4 = findViewById(R.id.Res4);
        Res5 = findViewById(R.id.Res5);
        Res6 = findViewById(R.id.Res6);
        Res7 = findViewById(R.id.Res7);
        Res8 = findViewById(R.id.Res8);
        Res9 = findViewById(R.id.Res9);
        Res10 = findViewById(R.id.Res10);



        Intent i = getIntent();
        Bundle b = i.getExtras();
        int Numero = b.getInt("Numero");

        int res1 = (Numero * 1);
        int res2 = (Numero * 2);
        int res3 = (Numero * 3);
        int res4 = (Numero * 4);
        int res5 = (Numero * 5);
        int res6 = (Numero * 6);
        int res7 = (Numero * 7);
        int res8 = (Numero * 8);
        int res9 = (Numero * 9);
        int res10 = (Numero * 10);

        String Numero2 = b.getString("Numero2");

        tv1.setText(Numero2 + " X 1");
        tv2.setText(Numero2 + " X 2");
        tv3.setText(Numero2 + " X 3");
        tv4.setText(Numero2 + " X 4");
        tv5.setText(Numero2 + " X 5");
        tv6.setText(Numero2 + " X 6");
        tv7.setText(Numero2 + " X 7");
        tv8.setText(Numero2 + " X 8");
        tv9.setText(Numero2 + " X 9");
        tv10.setText(Numero2 + " X 10");

        String ires1 = Integer.toString(res1);
        String ires2 = Integer.toString(res2);
        String ires3 = Integer.toString(res3);
        String ires4 = Integer.toString(res4);
        String ires5 = Integer.toString(res5);
        String ires6 = Integer.toString(res6);
        String ires7 = Integer.toString(res7);
        String ires8 = Integer.toString(res8);
        String ires9 = Integer.toString(res9);
        String ires10 = Integer.toString(res10);

        Res1.setText(ires1);
        Res2.setText(ires2);
        Res3.setText(ires3);
        Res4.setText(ires4);
        Res5.setText(ires5);
        Res6.setText(ires6);
        Res7.setText(ires7);
        Res8.setText(ires8);
        Res9.setText(ires9);
        Res10.setText(ires10);





//        Double Peso = b.getDouble("Peso");
//        Double Altura = b.getDouble("Altura");
//        String Nome = b.getString("Nome");
//
//        Double imc = Peso/(Altura+Altura);
//
//        tvIMC.setText(Double.toString(imc));
//        tvAltura2.setText(Double.toString(Altura));
//        tvPeso2.setText(Double.toString(Peso));
//        tvNome.setText(Nome);
//
//        imageView2.setImageResource(R.drawable.perfil);
//
//        if(imc<18.9){imageView2.setImageResource(R.drawable.abaixopeso);
//
//        }
//        if(imc>=18.9 && imc < 25){imageView2.setImageResource(R.drawable.normal);}
//        if(imc>=25 && imc < 30){imageView2.setImageResource(R.drawable.sobrepeso);}
//        if(imc>=30 && imc < 35){imageView2.setImageResource(R.drawable.obesidade1);}



    }
}