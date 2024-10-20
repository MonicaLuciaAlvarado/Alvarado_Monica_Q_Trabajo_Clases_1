/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author monic
 */
public enum Rol {
    DOCTORA("Doctora"),
    SECRETARIO("Secretario");

    private final String nombre;

    // Constructor
    Rol(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre asociado
    public String getNombre() {
        return nombre;
    }
}
