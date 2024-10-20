/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author monic
 */
public class Dueno{
    
    private String nombreCompleto;
    private int cedula;
    private int telefono;
    private String direccion;
    
    public Dueno(){
        this.nombreCompleto = "";
        this.cedula = 0;
        this.telefono = 0;
        this.direccion = "";  
    }
   
    public Dueno(String nombreCompleto, int cedula, int telefono, String direccion){
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;  
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Dueño = \n" +
                "Nombre Completo = " + getNombreCompleto() + "\n" +
                "Cédula = " + getCedula() + "\n" +
                "Teléfono = " + getTelefono() + "\n" +
                "Dirección = " + getDireccion() + "\n";
    }   
}
