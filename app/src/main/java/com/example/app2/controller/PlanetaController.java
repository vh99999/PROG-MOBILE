package com.example.app2.controller;

import com.example.app2.model.Planeta;
import com.example.app2.model.PlanetaDAO;

import java.util.ArrayList;

public class PlanetaController {

    PlanetaDAO planetaDAO;

    public PlanetaController() {
        planetaDAO = new PlanetaDAO();
    }

    public void addPlaneta(Planeta planeta) {
        planetaDAO.getPlanetas().add(planeta);
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetaDAO.getPlanetas();
    }

    public ArrayList<String> getNomesPlanetas() {
        ArrayList<String> nomes = new ArrayList<>();
        for (Planeta planeta : planetaDAO.getPlanetas()) {
            nomes.add(planeta.nome);
        }
        return nomes;
    }


}
