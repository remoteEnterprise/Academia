package com.example.barbosa.academia;

import android.media.Image;

/**
 * Created by barbosa on 07/09/16.
 */
public class DataProvider {
    private String nome;
    private int icone;

    public DataProvider(String nome, int icone){
        this.nome=nome;
        this.icone=icone;
    }

    public int getIcone() {
        return icone;
    }



    public String getNome() {
        return nome;
    }
}
