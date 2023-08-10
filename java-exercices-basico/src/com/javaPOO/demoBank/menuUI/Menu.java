package com.javaPOO.demoBank.menuUI;

import java.util.Scanner;

public class Menu {
    static Scanner entrada = new Scanner(System.in);
    private static int opcion;
    public static void MenuPrincipal(){
        do {
            System.out.println("*** Bienvenido al sistema Bancario ***");
            System.out.println("1. Cliente");
            System.out.println("2. Empleado");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            Opciones.escogerOpcion(opcion);
        }while (opcion == 1 || opcion == 2);
    }
    public static void menuCliente(){
        do {
            System.out.println("*** Menu del cliente ***");
            System.out.println("1. Ingresar un deposito");
            System.out.println("2. Realizar un retiro");
            System.out.println("3. Mostrar el saldo actual del cliente");
            System.out.println("4. Mostrar loss datos personales");
            System.out.println("5. Volver al menu anterior");
            opcion = entrada.nextInt();
            Opciones.escogerOpcionCliente(opcion);
        }while (opcion != 5);
    }

    public static void menuEmpleado(){
        do {
            System.out.println("*** Menu del empleado ***");
            System.out.println("1. Crear una cuenta bancaria");
            System.out.println("2. Realizar un deposito en una cuenta");
            System.out.println("3. Realizar un retiro en una cuenta");
            System.out.println("4. Mostrar el saldo actual de una cuenta");
            System.out.println("4. Mostrar los datos del cliente o empleado");
            System.out.println("5. Volver al menu anterior");
            opcion = entrada.nextInt();
            Opciones.escogerOpcionEmpleado(opcion);
        }while (opcion != 5);
    }

    public static int menuTipoCuenta(){
        System.out.println("1. Cuenta corriente");
        System.out.println("2. Cuenta ahorros");
        opcion = entrada.nextInt();
        return opcion;
    }
}
