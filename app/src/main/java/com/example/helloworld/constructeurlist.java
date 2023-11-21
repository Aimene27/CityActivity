package com.example.helloworld;

public class constructeurlist {

    private String nom;
    private String desc;
    private double prix;


    public constructeurlist(String nom, String desc, double prix){
        this.nom = nom;
        this.prix = prix
    }

    public String getNom() {return nom;}

    public String getDesc(){return desc;}
    public double getPrix(){return prix;}

}
