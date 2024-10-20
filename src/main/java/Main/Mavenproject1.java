/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import Clases.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

/**
 *
 * @author monic
 */

public class Mavenproject1 {
    public static void main(String[] args) {
        
        Veterinaria veterinariaMoka = new Veterinaria(5,0,0, new ArrayList<Reservacion>(),1, new ArrayList<Cita>(),
            new ArrayList<Mascota>(),new ArrayList<Usuario>());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String nombreMascota = "";
        Date fechaCita = null; //fechaCita
        String fechaCitaString = "";
        LocalTime horaCita = null; //horaCita
        String horaCitaString = "";
        String observaciones = "";
        Date fechaEntrada = null; //fechaEntrada
        Date fechaSalida = null; //fechaSalida
        String fechaEntradaString = "";
        String fechaSalidaString = "";
        int entradas =0;
        int salidas = 0;
        int hospedadas = 0;
        String nombreDueno = "";
        int cedulaDueno = 0;
        int telefonoDueno = 0;
        String direccionDueno = "";
        String descripcionMascota = "";
        int estrellas = -1;
        int estadoNum = -1;
        int rolNum = -1;
        String[] opcionesEstrellas = {"1","2","3"};
        String[] opcionesEstado = {"Activo","Inactivo"};
        String[] opcionesRol = {"Doctora","Secretario"};
        boolean estado = false;

        String[] opciones = {
            "1. Ingresar citas", 
            "2. Registrar reservación", 
            "3. Registrar una entrada",
            "4. Registrar una salida",
            "5. Registrar una mascota", 
            "6. Registrar un usuario", 
            "7. Desplegar citas", 
            "8. Desplegar reservaciones",
            "9. Desplegar mascotas",
            "10. Desplegar usuarios",
            "11. Salir"
        };
        int seleccion;

        do {
            seleccion = mostrarMenu(opciones);
            switch (seleccion) {
                case 0:
                    Cita cita = new Cita();
                    JOptionPane.showMessageDialog(null, "1. Ingrese una cita");
                    nombreMascota = JOptionPane.showInputDialog("Por favor, ingresa el nombre de la mascota:");//nombreMascota
                    fechaCitaString = JOptionPane.showInputDialog("Por favor, ingresa la fecha de la cita (dd/MM/yyyy):");

                    try {
                        fechaCita = formato.parse(fechaCitaString);
                        JOptionPane.showMessageDialog(null, "Fecha ingresada: " + formato.format(fechaCita));
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "Error: La fecha ingresada no es válida.");
                    }

                    // Pedir al usuario que ingrese una hora
                    horaCitaString = JOptionPane.showInputDialog("Por favor, ingresa la hora de la cita (HH:mm):");


                    try {
                        // Convertir la cadena ingresada a un objeto LocalTime
                        horaCita = LocalTime.parse(horaCitaString, formatoHora);
                        JOptionPane.showMessageDialog(null, "Hora ingresada: " + horaCita.format(formatoHora));
                    } catch (DateTimeParseException e) {
                        JOptionPane.showMessageDialog(null, "Error: La hora ingresada no es válida.");
                    }
        
                    observaciones = JOptionPane.showInputDialog("Por favor, indica para qué es la cita:");//observaciones

                    cita.setNombreMascota(nombreMascota);
                    cita.setFechaCita(fechaCita);
                    cita.setHoraCita(horaCita);
                    cita.setObservaciones(observaciones);
                    JOptionPane.showMessageDialog(null, cita.toString(), "Información de la Cita", JOptionPane.INFORMATION_MESSAGE);                    
                    veterinariaMoka.agregarCita(cita);
                    break;
                case 1:
                    Reservacion reservacion = new Reservacion();
                    JOptionPane.showMessageDialog(null, "2. Registre una reservación");
                                        
                    nombreMascota = JOptionPane.showInputDialog("Por favor, ingresa el nombre de la mascota:");//nombreMascota
                    fechaEntradaString = JOptionPane.showInputDialog("Por favor, ingresa la fecha de entrada (dd/MM/yyyy):");
                    try {
                        fechaEntrada = formato.parse(fechaEntradaString);
                        JOptionPane.showMessageDialog(null, "Fecha de entrada: " + formato.format(fechaEntrada));
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "Error: La fecha ingresada no es válida.");
                    }
                    
                    fechaSalidaString = JOptionPane.showInputDialog("Por favor, ingresa la fecha de salida (dd/MM/yyyy):");
                    try {
                        fechaSalida = formato.parse(fechaSalidaString);
                        JOptionPane.showMessageDialog(null, "Fecha de salida: " + formato.format(fechaSalida));
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "Error: La fecha ingresada no es válida.");
                    }
                    
                    reservacion.setNombreMascota(nombreMascota);
                    reservacion.setFechaEntrada(fechaEntrada);
                    reservacion.setFechaSalida(fechaSalida);
                    
                    JOptionPane.showMessageDialog(null, reservacion.toString(), "Información de la Reservación", JOptionPane.INFORMATION_MESSAGE);                    
                    veterinariaMoka.agregarReservacion(reservacion);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "3. Registró una entrada");
                    veterinariaMoka.agregarEntrada();
                    entradas = veterinariaMoka.getEntradas();
                    salidas = veterinariaMoka.getSalidas();
                    hospedadas = veterinariaMoka.getMascotasHospedadas();
                    JOptionPane.showMessageDialog(null, "La cantidad de entradas es de: " + entradas + "\n" + 
                            "La cantidad de salidas es de: " + salidas + "\n" + 
                            "La cantidad de mascotas hospedadas es de: " + hospedadas);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "4. Registró una salida");
                    veterinariaMoka.agregarSalida();
                    entradas = veterinariaMoka.getEntradas();
                    salidas = veterinariaMoka.getSalidas();
                    hospedadas = veterinariaMoka.getMascotasHospedadas();
                    JOptionPane.showMessageDialog(null, "La cantidad de entradas es de: " + entradas + "\n" + 
                            "La cantidad de salidas es de: " + salidas + "\n" + 
                            "La cantidad de mascotas hospedadas es de: " + hospedadas);
                    break;
                case 4:
                    Mascota mascota = new Mascota();
                    Dueno dueno = new Dueno();
                    JOptionPane.showMessageDialog(null, "5. Registre una mascota");
                    nombreMascota = JOptionPane.showInputDialog("Por favor, ingresa el nombre de la mascota:");//nombreMascota
                    nombreDueno = JOptionPane.showInputDialog("Por favor, ingresa el nombre del dueño:");//nombreDueno
                    cedulaDueno = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingresa el número de cédula del dueño:"));
                    telefonoDueno = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingresa el número de teléfono del dueño:"));
                    direccionDueno = JOptionPane.showInputDialog("Por favor, ingresa la dirección del dueño:");
                    dueno.setNombreCompleto(nombreDueno);
                    dueno.setCedula(cedulaDueno);
                    dueno.setTelefono(telefonoDueno);
                    dueno.setDireccion(direccionDueno);
                    descripcionMascota = JOptionPane.showInputDialog("Por favor, ingresa la descripción de la mascota:");
                    observaciones = JOptionPane.showInputDialog("Por favor, ingresa los cuidados particulares de la mascota:");
                                        
                    while (estrellas == -1){
                        estrellas = JOptionPane.showOptionDialog(null,"Por favor califica cuántas estrellas merece: ","Seleccionar opción",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionesEstrellas,opcionesEstrellas[0]);
                        if(estrellas == -1){
                            JOptionPane.showMessageDialog(null,"Debes de seleccionar una opción");
                        }
                        else if(estrellas == 0){
                            estrellas = 1;
                        }
                        else if(estrellas == 1){
                            estrellas = 2;
                        }
                        else{
                            estrellas = 3;
                        }
                    }
                    mascota.setNombreMascota(nombreMascota);
                    mascota.setDueno(dueno);
                    mascota.setDescripcionMascota(descripcionMascota);
                    mascota.setObservaciones(observaciones);
                    mascota.setEstrellas(estrellas);
                    JOptionPane.showMessageDialog(null, mascota.toString(), "Información de la Mascota", JOptionPane.INFORMATION_MESSAGE);                    
                    veterinariaMoka.agregarMascota(mascota);
                    estrellas = -1;
                    break;
                case 5:
                    Usuario usuario = new Usuario();
                    JOptionPane.showMessageDialog(null, "6. Registre un usuario");
                    
                    nombreDueno = JOptionPane.showInputDialog("Por favor, ingresa el nombre del usuario:");//nombreDueno
                    cedulaDueno = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingresa el número de cédula del usuario:"));
                    telefonoDueno = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingresa el número de teléfono del usuario:"));
                    direccionDueno = JOptionPane.showInputDialog("Por favor, ingresa la dirección del usuario:");
                    
                    while (estadoNum == -1){
                        estadoNum = JOptionPane.showOptionDialog(null,"Por favor seleccione el estado: ","Seleccionar opción",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionesEstado,opcionesEstado[0]);
                        if(estadoNum == -1){
                            JOptionPane.showMessageDialog(null,"Debes de seleccionar una opción");
                        }
                        else if(estadoNum == 0){
                            estado = true;
                        }
                        else if(estadoNum == 1){
                            estado = false;
                        }
                    }
                    
                    while (rolNum == -1){
                        rolNum = JOptionPane.showOptionDialog(null,"Por favor seleccione el estado: ","Seleccionar opción",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionesRol,opcionesRol[0]);
                        if(rolNum == -1){
                            JOptionPane.showMessageDialog(null,"Debes de seleccionar una opción");
                        }
                        else if(rolNum == 0){
                            usuario.setRol(Rol.DOCTORA);
                        }
                        else if(estadoNum == 1){
                            usuario.setRol(Rol.SECRETARIO);
                        }
                    }
                    
                    usuario.setNombreCompleto(nombreDueno);
                    usuario.setCedula(cedulaDueno);
                    usuario.setTelefono(telefonoDueno);
                    usuario.setDireccion(direccionDueno);
                    usuario.setEstado(estado);
                    
                    JOptionPane.showMessageDialog(null, usuario.toString(), "Información del Usuario", JOptionPane.INFORMATION_MESSAGE);                    
                    veterinariaMoka.agregarUsuario(usuario);                    
                    estadoNum=-1;
                    rolNum=-1;
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "7. Veamos las citas");
                    JOptionPane.showMessageDialog(null, veterinariaMoka.imprimirCitas(), "Citas de la veterinaria", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "8. Veamos las reservaciones");
                    JOptionPane.showMessageDialog(null, veterinariaMoka.imprimirReservaciones(), "Reservaciones de la veterinaria", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "9. Veamos las mascotas");
                    JOptionPane.showMessageDialog(null, veterinariaMoka.imprimirMascotas(), "Mascotas de la veterinaria", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "10. Veamos los usuarios");
                    JOptionPane.showMessageDialog(null, veterinariaMoka.imprimirUsuarios(), "Usuarios de la veterinaria", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "11. Saliendo...");
                    break;
                default:
                    break;
            }
        } while (seleccion != 10); // Salir del bucle si se elige "Salir"
    }

    private static int mostrarMenu(String[] opciones) {
        JList<String> list = new JList<>(opciones);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JOptionPane.showMessageDialog(null, new JScrollPane(list), "Menú de Opciones", JOptionPane.PLAIN_MESSAGE);
        return list.getSelectedIndex();
    }
}
