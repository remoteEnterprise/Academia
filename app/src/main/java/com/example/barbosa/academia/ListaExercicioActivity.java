package com.example.barbosa.academia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by barbosa on 09/09/16.
 */
public class ListaExercicioActivity extends AppCompatActivity {
    private ListView listaExercicios;
    private String[] exercicio;
    int[] listaImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_exercicios);

        listaExercicios = (ListView) findViewById(R.id.listaExercicios);

        listaExercicios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

//        MeuAdaptador adaptador;
//        int i = 0;
//        adaptador = new MeuAdaptador(getApplicationContext(), R.layout.celula_lista);
//        for (String nome : exercicio) {
//            DataProvider dataProvider = new DataProvider(nome, listaImagem[i]);
//            adaptador.add(dataProvider);
//            i++;
//        }
//        listaExercicios.setAdapter(adaptador);
    }

}
