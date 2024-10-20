/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author monic
 */
public class Mascota {

    private String nombreMascota;
    private Dueno dueno;
    private String descripcionMascota;
    private String observaciones;
    private int estrellas;
    
    public Mascota(){
    this.nombreMascota = "";
    this.dueno = null;
    this.descripcionMascota = "";
    this.observaciones = "";
    this.estrellas = 0;
    }
    
    public Mascota(String nombreMascota, Dueno dueno, String descripcionMascota, String observaciones, int estrellas){
    this.nombreMascota = nombreMascota;
    this.dueno = dueno;
    this.descripcionMascota = descripcionMascota;
    this.observaciones = observaciones;
    this.estrellas = estrellas;
    }
    
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public String getDescripcionMascota() {
        return descripcionMascota;
    }

    public void setDescripcionMascota(String descripcionMascota) {
        this.descripcionMascota = descripcionMascota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    
    @Override
    public String toString() {
        return "Mascota = \n" +
                "Nombre de la Mascota = " + nombreMascota + "\n" +
                 dueno.toString() + "\n" +
                "Descripción de la mascota = " + descripcionMascota + "\n" +
                "Observaciones = " + observaciones + "\n" +
                "Estrellas = " + estrellas;
    }
    
}
