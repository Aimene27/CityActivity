package com.example.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListactivityAdapt extends BaseAdapter {

    private Context context;
    private List<constructeurlist> constructeurlistList;
    private LayoutInflater inflater;

    public ListactivityAdapt(Context context, List<constructeurlist>constructeurlistList){

        this.context = context;
        this.constructeurlistList = constructeurlistList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return constructeurlistList.size();
    }

    @Override
    public constructeurlist getItem(int position) {
        return constructeurlistList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.template_item, null);

        // récupération info liste activité
        constructeurlist activitycible = getItem(i);
        String nomactivity = activitycible.getNom();
        String descactivity = activitycible.getDesc();
        double prixactivity = activitycible.getPrix();

        // récupération activité nom view
        TextView activitynomview = view.findViewById(R.id.nom_activity);
        activitynomview.setText(nomactivity);

        // récupération activité desc view
        TextView activitydescview = view.findViewById(R.id.desc_activity);
        activitydescview.setText(descactivity);

        // récupération activité prix view
        TextView activityprixview = view.findViewById(R.id.prix_activity);
        activityprixview.setText(prixactivity + "euros");


        return view;
    }
}
