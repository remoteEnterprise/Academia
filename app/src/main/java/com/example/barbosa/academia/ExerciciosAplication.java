package com.example.barbosa.academia;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by barbosa on 09/09/16.
 */
public class ExerciciosAplication extends Application {

    private List<Exercicio> Peito;

    public List<Exercicio> getPeito() {
        return Peito;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        crearPeito();
        Peito = new ArrayList<Exercicio>();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public void crearPeito() {
        Peito.add(new Exercicio("Supino", R.drawable.peito1, "Supino Normal"));
        Peito.add(new Exercicio("Supino Inclinado", R.drawable.peito1, "Supino inclinado"));
    }

}


