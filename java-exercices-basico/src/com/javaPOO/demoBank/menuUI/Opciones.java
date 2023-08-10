package com.javaPOO.demoBank.menuUI;
import com.company.cliente.Cliente;
import com.company.cuentaBancaria.CuentaBancaria;
import com.company.cuentaBancaria.CuentaCorriente;
import com.company.cuentaBancaria.GestionCuentasBancarias;
import java.util.ArrayList;
import java.util.Scanner;
public class Opciones {

    static ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<>();
    public static void escogerOpcion(int opc){
        switch (opc){
            case 1 -> {
                Menu.menuCliente();
            }
            case 2 -> {
                Menu.menuEmpleado();
            }
            case 3 -> {
                System.out.println("Gracias por ingresar al sistema");
            }

        }
    }
    public static void escogerOpcionCliente(int opc){
        switch (opc){
            case 1 -> {
                System.out.println("Esta es la opcion 1");
            }
            case 2 -> {
                System.out.println("Esta es la opcion 2");
            }
            case 3 -> {
                System.out.println("Esta es la opcion 3");
            }
            case 4 -> {
                System.out.println("Esta es la opcion 4");
            }
            case 5 -> {
                Menu.MenuPrincipal();
            }
        }
    }
    public static void escogerOpcionEmpleado(int opc){
        switch (opc){
            case 1 -> {
                char letra;
                Scanner entrada = new Scanner(System.in);
                int tipoCuenta = Menu.menuTipoCuenta();
                do {
                    System.out.println("Ingresa el id del cliente");
                    int id = entrada.nextInt();
                    System.out.println("Ingresa el saldo");
                    double saldo = entrada.nextDouble();
                    Cliente cliente = new Cliente(id);
                    CuentaBancaria cuenta1 = GestionCuentasBancarias.crearCuenta(tipoCuenta, cliente, saldo);
                    cuentasBancarias.add(cuenta1);
                    System.out.println("Deseas ingresar otra cuenta S/N");
                    letra = entrada.next().charAt(0);
                }while (letra == 'S');

            }
            case 2 -> {
                System.out.println("Esta es la opcion 2 del empleado");
            }
            case 3 -> {
                System.out.println("Esta es la opcion 3 del empleado");
            }
            case 4 -> {
                GestionCuentasBancarias.verCuentasBancarias(cuentasBancarias);
            }
            case 5 -> {
                Menu.MenuPrincipal();
            }

        }
    }

}
