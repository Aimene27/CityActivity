package com.example.helloworld;

public class MainModel {
    MainModel () {

    }
    String nom, desc, prix, adresse, image;

    public MainModel(String nom, String desc, String prix, String adresse, String image) {
        this.nom = nom;
        this.desc = desc;
        this.prix = prix;
        this.adresse = adresse;
        this.image = image;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}