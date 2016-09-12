package com.example.barbosa.academia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by barbosa on 07/09/16.
 */
public class MeuAdaptador extends ArrayAdapter {
    public MeuAdaptador(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Object object) {
        super.add(object);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.celula_lista, parent, false);
            handler = new DataHandler();
            handler.imageLista = (ImageView) row.findViewById(R.id.iconeLista);
            handler.nomeLista = (TextView) row.findViewById(R.id.nomeLista);
            row.setTag(handler);
        }else{
            handler=(DataHandler)row.getTag();
        }

        DataProvider dataProvider;
        dataProvider = (DataProvider) this.getItem(position);
        handler.imageLista.setImageResource(dataProvider.getIcone());
        handler.nomeLista.setText(dataProvider.getNome());
        return row;
    }

    private class DataHandler {
        ImageView imageLista;
        TextView nomeLista;
    }
}




