package com.javaPOO.introduccionObjetos;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();

        cuenta1.depositar(300);


        System.out.println(cuenta1.saldo);

        cuenta1.depositar(300);

        System.out.println(cuenta1.saldo);

        double retiro = cuenta1.retirar(400);

        System.out.println(cuenta1.saldo);

        Cuenta cuenta2 = new Cuenta();

        cuenta2.depositar(1000);

        cuenta2.transferir(200, cuenta1);

        System.out.println(cuenta1.saldo);
        System.out.println(cuenta2.saldo);



    }
}
