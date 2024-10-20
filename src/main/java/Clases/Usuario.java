/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author monic
 */

public class Usuario extends Dueno{

    private boolean estado;
    private Rol rol;
    
    public Usuario(){
        super();
        this.estado = false;
        this.rol = null;  
    }
   
    public Usuario(String nombreCompleto, int cedula, int telefono, String direccion, boolean estado, Rol rol){
        super(nombreCompleto, cedula, telefono, direccion);
        this.estado = estado;
        this.rol = rol;  
    }

    public String getEstadoComoTexto() {
        return isEstado() ? "activo" : "inactivo";
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }    
    
    @Override
    public String toString() {
        return "Usuario = \n" +
                "Nombre Completo = " + getNombreCompleto() + "\n" +
                "Cédula = " + getCedula() + "\n" +
                "Teléfono = " + getTelefono() + "\n" +
                "Dirección = " + getDireccion() + "\n" +
                "Estado = " + getEstadoComoTexto() + "\n" +
                "Rol = " + this.getRol().getNombre() + "\n";
    }
}
