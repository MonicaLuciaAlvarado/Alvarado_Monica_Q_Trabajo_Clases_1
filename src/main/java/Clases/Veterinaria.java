/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author monic
 */
public class Veterinaria {

    private int mascotasHospedadas;
    private int entradas;
    private int salidas;
    private ArrayList<Reservacion> listaReservaciones;
    private ArrayList<Cita> listaCitas;
    private ArrayList<Mascota> listaMascotas;
    private ArrayList<Usuario> listaUsuarios;
    private static final String NOMBRE_VETERINARIA = "Moka";
    private int sucursal;
    
    public Veterinaria() {
        this.mascotasHospedadas = 0;
        this.entradas = 0;
        this.salidas = 0;
        this.listaReservaciones = new ArrayList<>();
        this.sucursal = 0;
        this.listaCitas = new ArrayList<>();
        this.listaMascotas = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }
    
    public Veterinaria(int mascotasHospedadas,int entradas, int salidas, ArrayList<Reservacion> listaReservaciones,int sucursal, ArrayList<Cita> listaCitas,
    ArrayList<Mascota> listaMascotas, ArrayList<Usuario> listaUsuarios) {
        this.mascotasHospedadas = mascotasHospedadas;
        this.entradas = entradas;
        this.salidas = salidas;
        this.listaReservaciones = listaReservaciones;
        this.sucursal = sucursal;
        this.listaCitas = listaCitas;
        this.listaMascotas = listaMascotas;
        this.listaUsuarios = listaUsuarios;
    }

    public int getMascotasHospedadas() {
        return mascotasHospedadas;
    }
    
    public int getEntradas() {
        return entradas;
    }
    
    public int getSalidas() {
        return salidas;
    }
    
    public void agregarEntrada() {
        this.entradas++;
        this.mascotasHospedadas++;
    }
    
    public void agregarSalida() {
        this.salidas++;
        this.mascotasHospedadas--;
    }
    
    public void agregarReservacion(Reservacion reservacion) {
        listaReservaciones.add(reservacion);
    }

    public boolean quitarReservacion(Reservacion reservacion) {
        return listaReservaciones.remove(reservacion);
    }

    public String mostrarReservaciones() {
        if (listaReservaciones.isEmpty()) {
            return "No hay reservaciones programadas.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Reservacion reservacion : listaReservaciones) {
                sb.append(reservacion.toString()).append("\n");
            }
            return sb.toString();
        }
    }
    
    public int getSucursal() {
        return sucursal;
    }
    
    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }
    
    public void agregarCita(Cita cita) {
        listaCitas.add(cita);
    }

    public boolean quitarCita(Cita cita) {
        return listaCitas.remove(cita);
    }

    public String mostrarCitas() {
        if (listaCitas.isEmpty()) {
            return "No hay citas programadas.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Cita cita : listaCitas) {
                sb.append(cita.toString()).append("\n");
            }
            return sb.toString();
        }
    }
    
    public void agregarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }

    public boolean quitarMascota(Mascota mascota) {
        return listaMascotas.remove(mascota);
    }

    public String mostrarMascotas() {
        if (listaCitas.isEmpty()) {
            return "No hay mascotas.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Mascota mascota : listaMascotas) {
                sb.append(mascota.toString()).append("\n");
            }
            return sb.toString();
        }
    }
    
    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public boolean quitarUsuario(Usuario usuario) {
        return listaUsuarios.remove(usuario);
    }

    public String mostrarUsuarios() {
        if (listaUsuarios.isEmpty()) {
            return "No hay usuarios.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Usuario usuario : listaUsuarios) {
                sb.append(usuario.toString()).append("\n");
            }
            return sb.toString();
        }
    }
    
    public String imprimirCitas(){
        return "Citas en Veterinaria Moka \n Citas=\n" + mostrarCitas();
    }
    
    public String imprimirReservaciones(){
        return "Reservaciones en Veterinaria Moka \n Reservaciones=\n" + mostrarReservaciones();
    }
    
    public String imprimirMascotas(){
        return "Mascotas en Veterinaria Moka \n Mascotas=\n" + mostrarMascotas();
    }
    
    public String imprimirUsuarios(){
        return "Usuarios en Veterinaria Moka \n Usuarios=\n" + mostrarUsuarios();
    }
        
    @Override
    public String toString(){
        return "Veterinaria Moka{" +
                "Mascotas Hospedadas=" + getMascotasHospedadas() +
                ", Entradas=\n" + getEntradas() +
                ", Salidas=\n" + getSalidas() +
                ", Reservaciones=\n" + mostrarReservaciones() +
                ", Sucursal=\n" + getSucursal() +
                ", Citas=\n" + mostrarCitas() +
                ", Mascotas=\n" + mostrarMascotas() + '\'' +
                ", Usuarios=\n" + mostrarUsuarios() + '\'' +
                '}';
        }
}
