/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Cita {
    
    private String nombreMascota;
    private Date fechaCita;
    private LocalTime horaCita;
    private String observaciones;
    
    public Cita() {
        this.nombreMascota = "";
        this.fechaCita = new Date();
        this.horaCita = LocalTime.now();
        this.observaciones = "";
    }
    
    public Cita(String nombreMascota, Date fechaCita, LocalTime horaCita, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.observaciones = observaciones;
    }
    
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalTime horaCita) {
        this.horaCita = horaCita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
   @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Formato de la fecha
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm"); // Formato de la hora

        return "Cita = \n" +
                "Nombre de la mascota = " + nombreMascota + "\n" +
                "Fecha de la Cita = " + sdf.format(fechaCita) + "\n" +
                "Hora de la Cita = " + horaCita.format(dtf) + "\n" +
                "Observaciones = " + observaciones;
    }
}
