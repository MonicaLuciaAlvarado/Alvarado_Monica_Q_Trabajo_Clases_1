/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservacion {

    private String nombreMascota;
    private Date fechaEntrada;
    private Date fechaSalida;
    
    public Reservacion() {
        this.nombreMascota = "";
        this.fechaEntrada = new Date();
        this.fechaSalida = new Date();
    }
    
    public Reservacion(String nombreMascota, Date fechaEntrada, Date fechaSalida) {
        this.nombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
   @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "Reservación = \n" +
                "Nombre de la Mascota = " + getNombreMascota() + "\n" +
                "fecha de Entrada = " + sdf.format(getFechaEntrada()) + "\n" +
                "fecha de Salida = " + sdf.format(getFechaSalida()) + "\n";
    }
}
