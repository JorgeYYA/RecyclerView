package com.example.jorgeyya.recyclerview;

/**
 * Created by JorgeYYA on 28/11/2017.
 */

public class Element {

    private String nom;
    private float puntuacion;
    private String direccion;
    private float preu;
    private int imagen;


    public Element(String nom, float puntuacion, String direccion, float preu, int imagen) {
        this.nom = nom;
        this.puntuacion = puntuacion;
        this.direccion = direccion;
        this.preu = preu;
        this.imagen = imagen;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
