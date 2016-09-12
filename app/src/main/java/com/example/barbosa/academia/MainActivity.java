package com.example.barbosa.academia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] regiao = {"PEITO", "COSTA", "BICEPS", "TRICEPS", "OMBRO", "INFERIORES", "ABDOMEN"};
    int[] listaImagem= {R.drawable.peito1, R.drawable.costa1, R.drawable.biceps3,R.drawable.triceps ,
            R.drawable.ombro, R.drawable.pernas, R.drawable.abdomen};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ListaExercicioActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("tipo",i+1);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        MeuAdaptador adaptador;
        int i = 0;
        adaptador = new MeuAdaptador(getApplicationContext(), R.layout.celula_lista);
        for (String nome : regiao) {
            DataProvider dataProvider = new DataProvider(nome, listaImagem[i]);
            adaptador.add(dataProvider);
            i++;
        }
        listView.setAdapter(adaptador);
    }
}
