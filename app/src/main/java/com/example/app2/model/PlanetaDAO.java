package com.example.app2.model;

import com.example.app2.R;

import java.util.ArrayList;

public class PlanetaDAO {

    ArrayList<Planeta> arrayPlanetas;

    public PlanetaDAO(){

        arrayPlanetas = new ArrayList<Planeta>();
        arrayPlanetas.add(new Planeta("Mercurio", R.drawable.mercury));
        arrayPlanetas.add(new Planeta("Vênus", R.drawable.venus));
        arrayPlanetas.add(new Planeta("Terra", R.drawable.earth));
        arrayPlanetas.add(new Planeta("Marte", R.drawable.mars));
        arrayPlanetas.add(new Planeta("Júpiter", R.drawable.jupter));
        arrayPlanetas.add(new Planeta("Saturno", R.drawable.saturn));
        arrayPlanetas.add(new Planeta("Urano", R.drawable.uranus));
        arrayPlanetas.add(new Planeta("Netuno", R.drawable.neptune));



    }

    public ArrayList<Planeta> getPlanetas() {
        return arrayPlanetas;
    }
}
