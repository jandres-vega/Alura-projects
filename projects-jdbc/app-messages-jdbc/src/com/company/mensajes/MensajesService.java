package com.company.mensajes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = entrada.nextLine();
        System.out.println("tu nombre");
        String nombre = entrada.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);

        mensajesDAO.crearMensaje(registro);
    }
    public static void listarMensajes(){
        mensajesDAO.leerMensajes();
    }
    public static void borrarMensaje(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el id a eliminar");
        int id_mensaje = entrada.nextInt();
        mensajesDAO.borrarMensaje(id_mensaje);
    }
    public static void editarMensaje(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = entrada.nextLine();

        System.out.println("Indica el mensaje a editar");
        int id_mensaje = entrada.nextInt();

        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        mensajesDAO.actualizarMensaje(actualizacion);
    }
}
