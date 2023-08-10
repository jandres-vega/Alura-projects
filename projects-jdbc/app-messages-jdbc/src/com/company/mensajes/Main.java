package com.company.mensajes;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;

        do {
            System.out.println("----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Borrar mensajes");
            System.out.println("5. Salir");
            opc = entrada.nextInt();

            switch (opc){
                case 1 -> MensajesService.crearMensaje();
                case 2 -> MensajesService.listarMensajes();
                case 3 -> MensajesService.editarMensaje();
                case 4 -> MensajesService.borrarMensaje();
                default -> {}
            }
        }while (opc!=5);

    }
}
